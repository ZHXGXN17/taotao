/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  ContentServiceImpl.java   
 * @Package com.taotao.content.service.impl   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年5月29日 下午9:04:01   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.content.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.JsonUtils;
import com.taotao.content.service.ContentService;
import com.taotao.jedis.JedisClient;
import com.taotao.mapper.TbContentMapper;
import com.taotao.pojo.TbContent;
import com.taotao.pojo.TbContentExample;
import com.taotao.pojo.TbContentExample.Criteria;

/**
 * @author robin
 *
 */
@Service
public class ContentServiceImpl implements ContentService{
	
	@Autowired
	private TbContentMapper tbContentMapper;
	
	@Autowired
	private JedisClient jedisClient;

	/* (non-Javadoc)
	 * @see com.taotao.content.service.ContentService#add(com.taotao.pojo.TbContent)
	 */
	@Override
	public TaotaoResult add(TbContent content) {
		// 补全pojo属性
		content.setCreated(new Date());
		content.setUpdated(new Date());
		// 插入到内容表
		tbContentMapper.insert(content);
		// 删除缓存
		jedisClient.hdel("INDEX_CONTENT", content.getCategoryId().toString());
		return TaotaoResult.ok();
	}

	/* (non-Javadoc)
	 * @see com.taotao.content.service.ContentService#queryList(long)
	 */
	@Override
	public EasyUIDataGridResult queryList(long categoryId, int page, int rows) {
		PageHelper.startPage(page, rows);
		TbContentExample example = new TbContentExample();
		Criteria cri = example.createCriteria();
		cri.andCategoryIdEqualTo(categoryId);
		
		List<TbContent> list = tbContentMapper.selectByExample(example);
		// 取查询结果
		PageInfo<TbContent> pageInfo = new PageInfo<TbContent>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setRows(list);
		result.setTotal(pageInfo.getTotal());
		
		return result;
	}

	/* (non-Javadoc)
	 * @see com.taotao.content.service.ContentService#delete(long)
	 */
	@Override
	public TaotaoResult delete(long id) {
		tbContentMapper.deleteByPrimaryKey(id);
		jedisClient.hdel("INDEX_CONTENT", id + "");
		return TaotaoResult.ok();
	}

	/* (non-Javadoc)
	 * @see com.taotao.content.service.ContentService#update(com.taotao.pojo.TbContent)
	 */
	@Override
	public TaotaoResult update(TbContent content) {
		tbContentMapper.updateByPrimaryKey(content);
		jedisClient.hdel("INDEX_CONTENT", content.getCategoryId().toString());
		return TaotaoResult.ok();
	}

	/* (non-Javadoc)
	 * @see com.taotao.content.service.ContentService#getContentByCid(long)
	 */
	@Override
	public List<TbContent> getContentByCid(long categoryId) {
		// 先查询缓存
		// 添加缓存不能影响正常业务逻辑
		try {
			// 查询缓存
			String json = jedisClient.hget("INDEX_CONTENT", categoryId + "");
			// 查询到结果，把json转化为list返回
			if(StringUtils.isNotBlank(json)) {
				List<TbContent> list =JsonUtils.jsonToList(json, TbContent.class);
				return list;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		TbContentExample example = new TbContentExample();
	    Criteria cri = example.createCriteria();
	    cri.andCategoryIdEqualTo(categoryId);
	    List<TbContent> list = tbContentMapper.selectByExample(example);
	    // 把结果添加到缓存
	    try {
	    	jedisClient.hset("INDEX_CONTENT", categoryId + "", JsonUtils.objectToJson(list));
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
		return list;
	}

}





















