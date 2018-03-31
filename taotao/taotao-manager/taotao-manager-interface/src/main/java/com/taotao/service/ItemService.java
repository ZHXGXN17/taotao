/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  ItemService.java   
 * @Package com.taotao.service   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年3月28日 下午8:24:01   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.service;

import com.taotao.pojo.TbItem;

/**
 * 商品接口.
 *
 * @ClassName:  ItemService
 * @author: wangyf
 * @date:   2018-3-28 20:24:12
 */
public interface ItemService {
	
	TbItem getItemById(long itemId);

}
