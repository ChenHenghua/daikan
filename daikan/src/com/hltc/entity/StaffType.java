package com.hltc.entity;

/**
 * StaffType entity. @author MyEclipse Persistence Tools
 */

public class StaffType implements java.io.Serializable {

	// Fields

	private String staffTypeId;
	private String name;
	private String remarks;

	// Constructors

	/** default constructor */
	public StaffType() {
	}

	/** minimal constructor */
	public StaffType(String staffTypeId) {
		this.staffTypeId = staffTypeId;
	}

	/** full constructor */
	public StaffType(String staffTypeId, String name, String remarks) {
		this.staffTypeId = staffTypeId;
		this.name = name;
		this.remarks = remarks;
	}

	// Property accessors

	public String getStaffTypeId() {
		return this.staffTypeId;
	}

	public void setStaffTypeId(String staffTypeId) {
		this.staffTypeId = staffTypeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}