package com.jshop.entity;

// Generated 2012-6-18 12:25:49 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * PlaceoforiginT generated by hbm2java
 */
public class PlaceoforiginT implements java.io.Serializable {

	private String placeid;
	private String placename;
	private String creatorid;
	private Date createtime;

	public PlaceoforiginT() {
	}

	public PlaceoforiginT(String placeid, String placename, String creatorid,
			Date createtime) {
		this.placeid = placeid;
		this.placename = placename;
		this.creatorid = creatorid;
		this.createtime = createtime;
	}

	public String getPlaceid() {
		return this.placeid;
	}

	public void setPlaceid(String placeid) {
		this.placeid = placeid;
	}

	public String getPlacename() {
		return this.placename;
	}

	public void setPlacename(String placename) {
		this.placename = placename;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
