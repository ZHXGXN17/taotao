/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  IndexController.java   
 * @Package com.taotao.portal.controller   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年5月26日 下午4:34:35   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.portal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taotao.common.utils.JsonUtils;
import com.taotao.content.service.ContentService;
import com.taotao.pojo.TbContent;
import com.taotao.portal.pojo.AD1Node;

/**
 * @author robin
 *
 */
@Controller
public class IndexController {
	
	@Autowired
	private ContentService tbContentService;
	
	@RequestMapping("/index")
	public String showIndex(Model model) {
		// 根据categoryId查询轮播图内容列表
		List<TbContent> list = tbContentService.getContentByCid(89);
		// 把列表转化为AD1Node列表
		List<AD1Node> nodeList = new ArrayList<AD1Node>();
		for(TbContent content : list) {
			AD1Node node = new AD1Node();
			node.setWidth(670);
			node.setWidthB(550);
			node.setHeight(240);
			node.setHeightB(240);
			node.setAlt(content.getTitle());
			node.setSrc(content.getPic());
			node.setSrcB(content.getPic2());
			node.setHref(content.getUrl());
			nodeList.add(node);
		}
		// 把列表转化为json数据
		String ad1Json = JsonUtils.objectToJson(nodeList);
		// 把json数据传递给页面
		model.addAttribute("ad1", ad1Json);
		return "index";
	}

}
