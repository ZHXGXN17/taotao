/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  TbContent.java   
 * @Package com.taotao.pojo   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018-3-27 19:41:32   
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
 * 商品内容实体类.
 *
 * @ClassName:  TbContent
 * @author: wangyf
 * @date:   2018-3-27 19:41:37
 */
public class TbContent implements Serializable{
    
	private static final long serialVersionUID = 1L;

	/** ID. */
    private Long id;

    /** 内容类目ID. */
    private Long categoryId;

    /** 内容标题. */
    private String title;

    /** 子标题. */
    private String subTitle;

    /** 标题描述. */
    private String titleDesc;

    /** 链接地址. */
    private String url;

    /** 图片绝对路径. */
    private String pic;

    /** 图片绝对路径2. */
    private String pic2;

    /** 创建时间. */
    private Date created;

    /** 修改时间. */
    private Date updated;

    /** 内容. */
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public String getTitleDesc() {
        return titleDesc;
    }

    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc == null ? null : titleDesc.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TbContent [id=" + this.id + ", categoryId=" + this.categoryId + ", title=" + this.title + ", subTitle="
				+ this.subTitle + ", titleDesc=" + this.titleDesc + ", url=" + this.url + ", pic=" + this.pic
				+ ", pic2=" + this.pic2 + ", created=" + this.created + ", updated=" + this.updated + ", content="
				+ this.content + "]";
	}
}