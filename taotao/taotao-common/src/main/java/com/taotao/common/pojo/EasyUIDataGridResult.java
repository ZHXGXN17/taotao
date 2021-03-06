/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  EasyUIDataGridResult.java   
 * @Package com.taotao.common.pojo   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年5月26日 上午9:41:08   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author robin
 *
 */
public class EasyUIDataGridResult implements Serializable{
	
	private long total;
	
	private List rows;

	/**
	 * @return the total
	 */
	public long getTotal() {
		return this.total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(long total) {
		this.total = total;
	}

	/**
	 * @return the rows
	 */
	public List getRows() {
		return this.rows;
	}

	/**
	 * @param rows the rows to set
	 */
	public void setRows(List rows) {
		this.rows = rows;
	}
	
}
