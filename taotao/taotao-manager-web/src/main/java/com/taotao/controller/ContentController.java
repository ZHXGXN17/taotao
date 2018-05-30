/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  ContentController.java   
 * @Package com.taotao.controller   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年5月29日 下午9:10:11   
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.content.service.ContentService;
import com.taotao.pojo.TbContent;

/**
 * @author robin
 *
 */
@Controller
public class ContentController {
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/content/query/list")
	@ResponseBody
	public EasyUIDataGridResult queryList(@RequestParam(value = "categoryId", defaultValue = "0") long categoryId, int page, int rows){
		return contentService.queryList(categoryId, page, rows);
	}
	
	@RequestMapping("/content/save")
	@ResponseBody
	public TaotaoResult add(TbContent content) {
		return contentService.add(content);
	}
	
	
	@RequestMapping("/content/delete")
	@ResponseBody
	public TaotaoResult delete(long ids) {
		return contentService.delete(ids);
	}
	
	@RequestMapping("/content/edit")
	@ResponseBody
	public TaotaoResult update(TbContent content) {
		return contentService.update(content);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
