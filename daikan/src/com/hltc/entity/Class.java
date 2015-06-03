package com.hltc.entity;

/**
 * Class entity. @author MyEclipse Persistence Tools
 */

public class Class implements java.io.Serializable {

	// Fields

	private Short classId;
	private Short projectId;
	private String name;
	private String year;
	private String sclassid;
	private Long startDate;
	private Long endDate;
	private Long recentDeadline;
	private Long createTime;

	// Constructors

	/** default constructor */
	public Class() {
	}

	/** full constructor */
	public Class(Short projectId, String name, String year, String sclassid,
			Long startDate, Long endDate, Long recentDeadline, Long createTime) {
		this.projectId = projectId;
		this.name = name;
		this.year = year;
		this.sclassid = sclassid;
		this.startDate = startDate;
		this.endDate = endDate;
		this.recentDeadline = recentDeadline;
		this.createTime = createTime;
	}

	// Property accessors

	public Short getClassId() {
		return this.classId;
	}

	public void setClassId(Short classId) {
		this.classId = classId;
	}

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

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSclassid() {
		return this.sclassid;
	}

	public void setSclassid(String sclassid) {
		this.sclassid = sclassid;
	}

	public Long getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
	}

	public Long getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Long endDate) {
		this.endDate = endDate;
	}

	public Long getRecentDeadline() {
		return this.recentDeadline;
	}

	public void setRecentDeadline(Long recentDeadline) {
		this.recentDeadline = recentDeadline;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

}