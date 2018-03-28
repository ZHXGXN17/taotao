/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  TbContentCategory.java   
 * @Package com.taotao.pojo   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018-3-27 19:46:29   
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
 * 商品分类实体类.
 *
 * @ClassName:  TbContentCategory
 * @author: wangyf
 * @date:   2018-3-27 19:46:29
 */
public class TbContentCategory implements Serializable{

	private static final long serialVersionUID = 1L;

	/** 类目ID. */
    private Long id;

    /** 父类目ID=0时，为一级目录. */
    private Long parentId;

    /** 分类名称. */
    private String name;

    /** 状态，1：正常 2：删除. */
    private Integer status;

    /** 排列序号. */
    private Integer sortOrder;

    /** 是否为父类目，1：true 2：false. */
    private Boolean isParent;

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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
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
		return "TbContentCategory [id=" + this.id + ", parentId=" + this.parentId + ", name=" + this.name + ", status="
				+ this.status + ", sortOrder=" + this.sortOrder + ", isParent=" + this.isParent + ", created="
				+ this.created + ", updated=" + this.updated + "]";
	}
}