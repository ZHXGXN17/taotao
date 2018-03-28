/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  TbItemParamItem.java   
 * @Package com.taotao.pojo   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018-3-28 9:21:03   
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
 * 商品类目参数实体类.
 *
 * @ClassName:  TbItemParamItem
 * @author: wangyf
 * @date:   2018-3-28 9:21:03
 */
public class TbItemParamItem implements Serializable{
    
	private static final long serialVersionUID = 1L;

	/** ID. */
    private Long id;

    /** 商品ID. */
    private Long itemId;

    /** 创建时间. */
    private Date created;

    /** 修改时间. */
    private Date updated;

    /** 参数格式，JSON数据. */
    private String paramData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
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

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TbItemParamItem [id=" + this.id + ", itemId=" + this.itemId + ", created=" + this.created + ", updated="
				+ this.updated + ", paramData=" + this.paramData + "]";
	}
}