package com.hltc.entity;

import java.util.Date;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private String orderId;
	private String customerId;
	private String projectId;
	private String staffId;
	private String service;
	private Float price;
	private Date date;
	private String deviceId;
	private String browserId;
	private String remark;
	private Date lastLogin;
	private Date expiredTime;
	private String courseFinished;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(String orderId, String deviceId, Date expiredTime) {
		this.orderId = orderId;
		this.deviceId = deviceId;
		this.expiredTime = expiredTime;
	}

	/** full constructor */
	public Orders(String orderId, String customerId, String projectId,
			String staffId, String service, Float price, Date date,
			String deviceId, String browserId, String remark, Date lastLogin,
			Date expiredTime, String courseFinished) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.projectId = projectId;
		this.staffId = staffId;
		this.service = service;
		this.price = price;
		this.date = date;
		this.deviceId = deviceId;
		this.browserId = browserId;
		this.remark = remark;
		this.lastLogin = lastLogin;
		this.expiredTime = expiredTime;
		this.courseFinished = courseFinished;
	}

	// Property accessors

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getBrowserId() {
		return this.browserId;
	}

	public void setBrowserId(String browserId) {
		this.browserId = browserId;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Date getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getCourseFinished() {
		return this.courseFinished;
	}

	public void setCourseFinished(String courseFinished) {
		this.courseFinished = courseFinished;
	}

}