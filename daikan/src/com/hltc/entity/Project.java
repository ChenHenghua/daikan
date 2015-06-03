package com.hltc.entity;

/**
 * Project entity. @author MyEclipse Persistence Tools
 */

public class Project implements java.io.Serializable {

	// Fields

	private Short projectId;
	private String name;
	private String url;
	private String remark;
	private Boolean isopen;
	private String spid;

	// Constructors

	/** default constructor */
	public Project() {
	}

	/** full constructor */
	public Project(String name, String url, String remark, Boolean isopen,
			String spid) {
		this.name = name;
		this.url = url;
		this.remark = remark;
		this.isopen = isopen;
		this.spid = spid;
	}

	// Property accessors

	public Short getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Short projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Boolean getIsopen() {
		return this.isopen;
	}

	public void setIsopen(Boolean isopen) {
		this.isopen = isopen;
	}

	public String getSpid() {
		return this.spid;
	}

	public void setSpid(String spid) {
		this.spid = spid;
	}

}