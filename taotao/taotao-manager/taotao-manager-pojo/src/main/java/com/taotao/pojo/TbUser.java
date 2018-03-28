/*
 ***************************************************************************************
 * All rights Reserved, Designed By www.vic.com.cn
 * @Title:  TbUser.java   
 * @Package com.taotao.pojo   
 * @Description: (用一句话描述该文件做什么)   
 * @author: wangyf
 * @date:   2018-3-28 9:33:31   
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
 * 用户实体类.
 *
 * @ClassName:  TbUser
 * @author: wangyf
 * @date:   2018-3-28 9:33:31
 */
public class TbUser implements Serializable{
    
	private static final long serialVersionUID = 1L;

	/** ID. */
    private Long id;

    /** 用户名. */
    private String username;

    /** 用户密码，加密存储. */
    private String password;

    /** 注册手机号. */
    private String phone;

    /** 注册邮箱. */
    private String email;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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
		return "TbUser [id=" + this.id + ", username=" + this.username + ", password=" + this.password + ", phone="
				+ this.phone + ", email=" + this.email + ", created=" + this.created + ", updated=" + this.updated
				+ "]";
	}
}