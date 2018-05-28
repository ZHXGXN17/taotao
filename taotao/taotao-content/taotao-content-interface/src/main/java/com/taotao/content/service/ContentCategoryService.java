/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  ContentCategoryService.java   
 * @Package com.taotao.content.service   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年5月27日 上午9:36:00   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.content.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.common.pojo.TaotaoResult;

/**
 * @author robin
 *
 */
public interface ContentCategoryService {
	
	List<EasyUITreeNode> getContentCategoryList(long parentId);
	
	TaotaoResult addContentCategory(long parentId, String name);
	
	TaotaoResult updateContentCategory(long id, String name);
	
	TaotaoResult delete(long id);

}
