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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.content.service.ContentService;
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
		return TaotaoResult.ok();
	}

	/* (non-Javadoc)
	 * @see com.taotao.content.service.ContentService#queryList(long)
	 */
	@Override
	public List<EasyUITreeNode> queryList(long categoryId) {
		TbContentExample example = new TbContentExample();
		Criteria cri = example.createCriteria();
		cri.andCategoryIdEqualTo(categoryId);
		
		List<TbContent> list = tbContentMapper.selectByExample(example);
		List<EasyUITreeNode> resultList = new ArrayList<EasyUITreeNode>();
		for(TbContent content : list) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(content.getId());
			node.setText(content.getTitle());
			node.setState(content.getSubTitle());
			resultList.add(node);
		}
		return resultList;
	}

}





















