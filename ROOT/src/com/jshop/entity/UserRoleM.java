package com.jshop.entity;

// Generated 2012-6-7 14:23:05 by Hibernate Tools 3.4.0.CR1

/**
 * UserRoleM generated by hbm2java
 */
public class UserRoleM implements java.io.Serializable {

	private String id;
	private String userid;
	private String roleid;

	public UserRoleM() {
	}

	public UserRoleM(String id, String userid, String roleid) {
		this.id = id;
		this.userid = userid;
		this.roleid = roleid;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

}
