/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  EasyUITreeNode.java   
 * @Package com.taotao.common.pojo   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年5月13日 上午10:19:29   
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

/**
 * @author robin
 *
 */
public class EasyUITreeNode implements Serializable{

	private long id;
	
	private String text;
	
	private String state;

	/**
	 * 
	 */
	public EasyUITreeNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param text
	 * @param state
	 */
	public EasyUITreeNode(long id, String text, String state) {
		super();
		this.id = id;
		this.text = text;
		this.state = state;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EasyUITreeNode [id=" + this.id + ", text=" + this.text + ", state=" + this.state + "]";
	}
	
	
}
