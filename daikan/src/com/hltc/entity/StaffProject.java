package com.hltc.entity;

/**
 * StaffProject entity. @author MyEclipse Persistence Tools
 */

public class StaffProject implements java.io.Serializable {

	// Fields

	private String psid;
	private String project;
	private String staff;

	// Constructors

	/** default constructor */
	public StaffProject() {
	}

	/** minimal constructor */
	public StaffProject(String psid) {
		this.psid = psid;
	}

	/** full constructor */
	public StaffProject(String psid, String project, String staff) {
		this.psid = psid;
		this.project = project;
		this.staff = staff;
	}

	// Property accessors

	public String getPsid() {
		return this.psid;
	}

	public void setPsid(String psid) {
		this.psid = psid;
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getStaff() {
		return this.staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

}