package com.hltc.entity;

/**
 * Browser entity. @author MyEclipse Persistence Tools
 */

public class Browser implements java.io.Serializable {

	// Fields

	private String browserId;
	private String name;
	private String remark;

	// Constructors

	/** default constructor */
	public Browser() {
	}

	/** full constructor */
	public Browser(String browserId, String name, String remark) {
		this.browserId = browserId;
		this.name = name;
		this.remark = remark;
	}

	// Property accessors

	public String getBrowserId() {
		return this.browserId;
	}

	public void setBrowserId(String browserId) {
		this.browserId = browserId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}