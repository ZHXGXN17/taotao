/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  ItemController.java   
 * @Package com.taotao.controller   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年3月29日 下午8:15:37   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

/**
 * 商品管理Controller.
 *
 * @ClassName:  ItemController
 * @author: wangyf
 * @date:   2018-3-29 20:15:44
 */
@Controller
public class ItemController {
	
	/** 商品业务层. */
	@Autowired
	private ItemService itemService;
	
	
	/**
	 * 
	 * @param itemId
	 * @return
	 */
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable long itemId) {
		return itemService.getItemById(itemId);
	}
	
	
	/**
	 * 分页展示数据
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
		return itemService.getItemList(page, rows);
	}
	

	/**
	 * 新建商品
	 * @param item
	 * @param desc
	 * @return
	 */
	@RequestMapping(value = "/item/save", method = RequestMethod.POST)
	@ResponseBody
	public TaotaoResult addItem(TbItem item, String desc) {
		return itemService.addItem(item, desc);
	}
}

















