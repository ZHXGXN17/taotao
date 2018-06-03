/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  AD1Node.java   
 * @Package com.taotao.portal.pojo   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018年6月2日 上午9:17:27   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.portal.pojo;

/**
 * @author robin
 *
 */
public class AD1Node {
	
	/** src B. */
	private String srcB;
	
	/** height. */
	private Integer height;
	
	/** alt. */
	private String alt;
	
	/** width. */
	private Integer width;
	
	/** src. */
	private String src;
	
	/** width B. */
	private Integer widthB;
	
	/** href. */
	private String href;
	
	/** height B. */
	private Integer heightB;

	/**
	 * 
	 */
	public AD1Node() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param srcB
	 * @param height
	 * @param alt
	 * @param width
	 * @param src
	 * @param widthB
	 * @param href
	 * @param heightB
	 */
	public AD1Node(String srcB, Integer height, String alt, Integer width, String src, Integer widthB, String href,
			Integer heightB) {
		super();
		this.srcB = srcB;
		this.height = height;
		this.alt = alt;
		this.width = width;
		this.src = src;
		this.widthB = widthB;
		this.href = href;
		this.heightB = heightB;
	}

	/**
	 * @return the srcB
	 */
	public String getSrcB() {
		return this.srcB;
	}

	/**
	 * @param srcB the srcB to set
	 */
	public void setSrcB(String srcB) {
		this.srcB = srcB;
	}

	/**
	 * @return the height
	 */
	public Integer getHeight() {
		return this.height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * @return the alt
	 */
	public String getAlt() {
		return this.alt;
	}

	/**
	 * @param alt the alt to set
	 */
	public void setAlt(String alt) {
		this.alt = alt;
	}

	/**
	 * @return the width
	 */
	public Integer getWidth() {
		return this.width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * @return the src
	 */
	public String getSrc() {
		return this.src;
	}

	/**
	 * @param src the src to set
	 */
	public void setSrc(String src) {
		this.src = src;
	}

	/**
	 * @return the widthB
	 */
	public Integer getWidthB() {
		return this.widthB;
	}

	/**
	 * @param widthB the widthB to set
	 */
	public void setWidthB(Integer widthB) {
		this.widthB = widthB;
	}

	/**
	 * @return the href
	 */
	public String getHref() {
		return this.href;
	}

	/**
	 * @param href the href to set
	 */
	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * @return the heightB
	 */
	public Integer getHeightB() {
		return this.heightB;
	}

	/**
	 * @param heightB the heightB to set
	 */
	public void setHeightB(Integer heightB) {
		this.heightB = heightB;
	}

}
