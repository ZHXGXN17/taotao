/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  TbOrderShipping.java   
 * @Package com.taotao.pojo   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018-3-28 9:30:27   
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
 * 订单收货人实体类.
 *
 * @ClassName:  TbOrderShipping
 * @author: wangyf
 * @date:   2018-3-28 9:30:27
 */
public class TbOrderShipping implements Serializable{
    
	private static final long serialVersionUID = 1L;

	/** 订单ID. */
    private String orderId;

    /** 收货人全名. */
    private String receiverName;

    /** 收货人固定电话. */
    private String receiverPhone;

    /** 收货人移动电话. */
    private String receiverMobile;

    /** 省份. */
    private String receiverState;

    /** 城市. */
    private String receiverCity;

    /** 区/县. */
    private String receiverDistrict;

    /** 收货地址，如：xx路xx号. */
    private String receiverAddress;

    /** 邮政编码,如：310001. */
    private String receiverZip;

    /** 创建时间. */
    private Date created;

    /** 修改时间. */
    private Date updated;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    public String getReceiverState() {
        return receiverState;
    }

    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState == null ? null : receiverState.trim();
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict == null ? null : receiverDistrict.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getReceiverZip() {
        return receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip == null ? null : receiverZip.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TbOrderShipping [orderId=" + this.orderId + ", receiverName=" + this.receiverName + ", receiverPhone="
				+ this.receiverPhone + ", receiverMobile=" + this.receiverMobile + ", receiverState="
				+ this.receiverState + ", receiverCity=" + this.receiverCity + ", receiverDistrict="
				+ this.receiverDistrict + ", receiverAddress=" + this.receiverAddress + ", receiverZip="
				+ this.receiverZip + ", created=" + this.created + ", updated=" + this.updated + "]";
	}
}