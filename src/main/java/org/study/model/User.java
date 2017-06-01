package org.study.model;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;

/**
 * 这个�?个pojo的类，对应数据库的User�?
 *
 */
public class User {
	/** 主键ID */
	private Integer id;
	/** 加密盐�?? */
	private String salt;
	/** 登录�? */
	private String loginName;
	/** 密码 */
	private String password;
	/** 邮箱 */
	private String email;
	/** 创建时间 */
	private Date createTime;
	/** 状�?? */
	private Integer status;
	
	
	private List<Role> roles;
	
	
	public User() {}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String toString() {
		return JSON.toJSONString(this);
	}
	
}
