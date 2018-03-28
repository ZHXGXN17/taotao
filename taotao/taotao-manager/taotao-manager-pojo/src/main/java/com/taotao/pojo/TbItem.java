/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  TbItem.java   
 * @Package com.taotao.pojo   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018-3-27 19:51:01   
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
 * 商品实体类.
 *
 * @ClassName:  TbItem
 * @author: wangyf
 * @date:   2018-3-27 19:51:01
 */
public class TbItem implements Serializable{
    
	private static final long serialVersionUID = 1L;

	/** 商品ID，商品编号. */
    private Long id;

    /** 商品标题. */
    private String title;

    /** 商品卖点. */
    private String sellPoint;

    /** 商品价格，单位：分. */
    private Long price;

    /** 库存数量. */
    private Integer num;

    /** 商品条形码. */
    private String barcode;

    /** 商品图片. */
    private String image;

    /** 所属类目. */
    private Long cid;

    /** 商品状态，1：正常 2：下架 3：删除. */
    private Byte status;

    /** 创建时间. */
    private Date created;

    /** 修改时间. */
    private Date updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint == null ? null : sellPoint.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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
		return "TbItem [id=" + this.id + ", title=" + this.title + ", sellPoint=" + this.sellPoint + ", price="
				+ this.price + ", num=" + this.num + ", barcode=" + this.barcode + ", image=" + this.image + ", cid="
				+ this.cid + ", status=" + this.status + ", created=" + this.created + ", updated=" + this.updated
				+ "]";
	}
}