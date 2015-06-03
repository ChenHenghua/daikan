package com.hltc.entity;

/**
 * Staff entity. @author MyEclipse Persistence Tools
 */

public class Staff implements java.io.Serializable {

	// Fields

	private Short staffId;
	private String username;
	private String password;
	private Short staffTypeId;
	private String remarks;
	private String name;
	private String tel;
	private Long qq;
	private String area;

	// Constructors

	/** default constructor */
	public Staff() {
	}

	/** minimal constructor */
	public Staff(Short staffId) {
		this.staffId = staffId;
	}

	/** full constructor */
	public Staff(Short staffId, String username, String password,
			Short staffTypeId, String remarks, String name, String tel,
			Long qq, String area) {
		this.staffId = staffId;
		this.username = username;
		this.password = password;
		this.staffTypeId = staffTypeId;
		this.remarks = remarks;
		this.name = name;
		this.tel = tel;
		this.qq = qq;
		this.area = area;
	}

	// Property accessors

	public Short getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Short staffId) {
		this.staffId = staffId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Short getStaffTypeId() {
		return this.staffTypeId;
	}

	public void setStaffTypeId(Short staffTypeId) {
		this.staffTypeId = staffTypeId;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Long getQq() {
		return this.qq;
	}

	public void setQq(Long qq) {
		this.qq = qq;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}