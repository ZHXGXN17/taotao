/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  ItemCatServiceImpl.java   
 * @Package com.taotao.service.impl   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年5月13日 上午10:26:33   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemCatExample.Criteria;
import com.taotao.service.ItemCatService;

/**
 * @author robin
 *
 */
@Service
public class ItemCatServiceImpl implements ItemCatService{
	
	@Autowired
	private TbItemCatMapper tbItemCatMapper;

	@Override
	public List<EasyUITreeNode> getItemCatList(long parentId) {
		TbItemCatExample example = new TbItemCatExample();
		// 设置查询条件
		Criteria criteria = example.createCriteria();
		// 设置parentId
		criteria.andParentIdEqualTo(parentId);
		// 执行查询
		List<TbItemCat> list = tbItemCatMapper.selectByExample(example);
		List<EasyUITreeNode> result = new ArrayList<EasyUITreeNode>();
		// 转换成EasyUITreeNode列表
		for(TbItemCat cat : list) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(cat.getId());
			node.setText(cat.getName());
			// 如果节点下有子节点“closed”，没有则为“open”
			node.setState(cat.getIsParent() ? "closed":"open");
			result.add(node);
		}
		
		return result;
	}

}

























