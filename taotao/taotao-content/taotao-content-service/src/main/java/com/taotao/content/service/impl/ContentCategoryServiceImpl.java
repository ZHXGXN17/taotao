/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  ContentCategoryServiceImpl.java   
 * @Package com.taotao.content.service.impl   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年5月27日 上午9:38:25   
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
import com.taotao.content.service.ContentCategoryService;
import com.taotao.mapper.TbContentCategoryMapper;
import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import com.taotao.pojo.TbContentCategoryExample.Criteria;

/**
 * @author robin
 * 内容分类管理业务层
 *
 */
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {
	
	@Autowired
	private TbContentCategoryMapper tbContentCategoryMapper;

	/**
	 * 查询内容列表
	 */
	@Override
	public List<EasyUITreeNode> getContentCategoryList(long parentId) {
		// 根据parentId查询子节点列表
		TbContentCategoryExample example = new TbContentCategoryExample();
		// 设置查询条件
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		// 执行查询
		List<TbContentCategory> list = tbContentCategoryMapper.selectByExample(example);
		List<EasyUITreeNode> resultList = new ArrayList<EasyUITreeNode>();
		for(TbContentCategory content : list) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(content.getId());
			node.setText(content.getName());
			node.setState(content.getIsParent() ? "closed" : "open");
			// 添加到结果列表
			resultList.add(node);
		}
		return resultList;
	}

	/* (non-Javadoc)
	 * @see com.taotao.content.service.ContentCategoryService#addContentCategory(long, java.lang.String)
	 */
	@Override
	public TaotaoResult addContentCategory(long parentId, String name) {
		// 创建pojo对象
		TbContentCategory content = new TbContentCategory();
		// 补全对象的属性
		content.setParentId(parentId);
		content.setName(name);
		// 状态。可选值:1(正常),2(删除)
		content.setStatus(1);
		// 排序，默认为1
		content.setSortOrder(1);
		content.setIsParent(false);
		content.setCreated(new Date());
		content.setUpdated(new Date());
		// 插入到数据库
		tbContentCategoryMapper.insert(content);
		// 判断父节点的状态
		TbContentCategory parent = tbContentCategoryMapper.selectByPrimaryKey(parentId);
		if(!parent.getIsParent()) {
			// 如果父节点为子节点，则修改为父节点
			parent.setIsParent(true);
			// 更新数据
		    tbContentCategoryMapper.updateByPrimaryKey(parent);
		}
		// 返回结果
		return TaotaoResult.ok(content);
	}

	/* (non-Javadoc)
	 * @see com.taotao.content.service.ContentCategoryService#updateContentCategory(long, java.lang.String)
	 */
	@Override
	public TaotaoResult updateContentCategory(long id, String name) {
		// 根据id查询数据然后修改name
		TbContentCategory content = tbContentCategoryMapper.selectByPrimaryKey(id);
		content.setName(name);
		content.setUpdated(new Date());
		tbContentCategoryMapper.updateByPrimaryKey(content);
		return TaotaoResult.ok();
	}

	/* (non-Javadoc)
	 * @see com.taotao.content.service.ContentCategoryService#delete(long)
	 */
	@Override
	public TaotaoResult delete(long id) {
		// 根据id查询数据然后修改name
		TbContentCategory content = tbContentCategoryMapper.selectByPrimaryKey(id);
		// 先判断是否为父节点
		if(content.getIsParent()) {
			return TaotaoResult.ok(content);
		}else {
			tbContentCategoryMapper.deleteByPrimaryKey(id);
			return TaotaoResult.ok();
		}
	}

}























