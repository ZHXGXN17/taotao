/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  ItemServiceImpl.java   
 * @Package com.taotao.service.impl   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年3月28日 下午8:25:57   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.IDUtils;
import com.taotao.mapper.TbItemDescMapper;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;

/**
 * 商品业务层.
 *
 * @ClassName:  ItemServiceImpl
 * @author: wangyf
 * @date:   2018-3-28 20:26:50
 */
@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private TbItemMapper tbItemMapper;

	@Autowired
	private TbItemDescMapper tbItemDescMapper;

	/**
	 * 根据ID查询商品信息
	 */
	@Override
	public TbItem getItemById(long itemId) {
		return tbItemMapper.selectByPrimaryKey(itemId);
	}
	
	/**
	 * 分页查询
	 */
	@Override
	public EasyUIDataGridResult getItemList(int page, int rows) {
		// 设置分页信息
		PageHelper.startPage(page, rows);
		// 执行查询
		TbItemExample example = new TbItemExample();
		List<TbItem> list = tbItemMapper.selectByExample(example);
		// 取查询结果
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setRows(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	
	/**
	 * 添加
	 */
	@Override
	public TaotaoResult addItem(TbItem item, String desc) {
		// 生成商品ID
		long itemId = IDUtils.genItemId();
		// 补全item属性
		item.setId(itemId);
		// 商品状态，1-正常，2-下架，3-删除
		item.setStatus((byte)1);
		item.setCreated(new Date());
		item.setUpdated(new Date());
		// 向商品表插入数据
		tbItemMapper.insert(item);
		
		// 创建一个商品描述表对应的pojo
		TbItemDesc itemDesc = new TbItemDesc();
		// 补全pojo属性
		itemDesc.setItemId(itemId);
		itemDesc.setItemDesc(desc);
		itemDesc.setCreated(new Date());
		itemDesc.setUpdated(new Date());
		// 向商品描述表插入数据
		tbItemDescMapper.insert(itemDesc);
		
		return TaotaoResult.ok();
	}

}

















