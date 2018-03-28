/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  TbOrder.java   
 * @Package com.taotao.pojo   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018-3-28 9:23:18   
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
import java.util.Date;

/**
 * 商品订单实体类.
 *
 * @ClassName:  TbOrder
 * @author: wangyf
 * @date:   2018-3-28 9:23:18
 */
public class TbOrder implements Serializable{
    
	private static final long serialVersionUID = 1L;

	/** 订单ID. */
    private String orderId;

    /** 实付金额，精确2位. */
    private String payment;

    /** 支付类型，1：在线支付 2：货到付款. */
    private Integer paymentType;

    /** 邮费，精确2位. */
    private String postFee;

    /** 订单状态，1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭. */
    private Integer status;

    /** 订单创建时间. */
    private Date createTime;

    /** 订单修改时间. */
    private Date updateTime;

    /** 付款时间. */
    private Date paymentTime;

    /** 发货时间. */
    private Date consignTime;

    /** 交易完成时间. */
    private Date endTime;

    /** 交易关闭时间. */
    private Date closeTime;

    /** 物流名称. */
    private String shippingName;

    /** 物流单号. */
    private String shippingCode;

    /** 用户ID. */
    private Long userId;

    /** 买家留言. */
    private String buyerMessage;

    /** 买家昵称. */
    private String buyerNick;

    /** 买家是否已经评价. */
    private Integer buyerRate;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee == null ? null : postFee.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    public Integer getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(Integer buyerRate) {
        this.buyerRate = buyerRate;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TbOrder [orderId=" + this.orderId + ", payment=" + this.payment + ", paymentType=" + this.paymentType
				+ ", postFee=" + this.postFee + ", status=" + this.status + ", createTime=" + this.createTime
				+ ", updateTime=" + this.updateTime + ", paymentTime=" + this.paymentTime + ", consignTime="
				+ this.consignTime + ", endTime=" + this.endTime + ", closeTime=" + this.closeTime + ", shippingName="
				+ this.shippingName + ", shippingCode=" + this.shippingCode + ", userId=" + this.userId
				+ ", buyerMessage=" + this.buyerMessage + ", buyerNick=" + this.buyerNick + ", buyerRate="
				+ this.buyerRate + "]";
	}
}