/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  TbOrderItem.java   
 * @Package com.taotao.pojo   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018-3-28 9:28:27   
 * @version V1.0 
 * @Copyright: 2018 北京vic科技有限责任公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 *  ---------------------------------------------------------------------------------- 
 * 文件修改记录
 *     文件版本：         修改人：             修改原因：
 ***************************************************************************************
 */
package com.taotao.pojo;

import java.io.Serializable;

/**
 * 订单商品实体类.
 *
 * @ClassName:  TbOrderItem
 * @author: wangyf
 * @date:   2018-3-28 9:28:27
 */
public class TbOrderItem implements Serializable{
    
	private static final long serialVersionUID = 1L;

	/** ID. */
    private String id;

    /** 商品ID. */
    private String itemId;

    /** 订单ID. */
    private String orderId;

    /** 商品购买数量. */
    private Integer num;

    /** 商品标题. */
    private String title;

    /** 商品单价. */
    private Long price;

    /** 商品总金额. */
    private Long totalFee;

    /** 商品图片地址. */
    private String picPath;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TbOrderItem [id=" + this.id + ", itemId=" + this.itemId + ", orderId=" + this.orderId + ", num="
				+ this.num + ", title=" + this.title + ", price=" + this.price + ", totalFee=" + this.totalFee
				+ ", picPath=" + this.picPath + "]";
	}
}