package com.hltc.entity;

/**
 * Qqgroup entity. @author MyEclipse Persistence Tools
 */

public class Qqgroup implements java.io.Serializable {

	// Fields

	private Long number;
	private String name;
	private String staffId;
	private String remark;
	private String projectId;

	// Constructors

	/** default constructor */
	public Qqgroup() {
	}

	/** minimal constructor */
	public Qqgroup(Long number) {
		this.number = number;
	}

	/** full constructor */
	public Qqgroup(Long number, String name, String staffId, String remark,
			String projectId) {
		this.number = number;
		this.name = name;
		this.staffId = staffId;
		this.remark = remark;
		this.projectId = projectId;
	}

	// Property accessors

	public Long getNumber() {
		return this.number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}