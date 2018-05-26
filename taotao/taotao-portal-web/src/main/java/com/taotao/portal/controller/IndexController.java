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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author robin
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String showIndex() {
		return "index";
	}

}
