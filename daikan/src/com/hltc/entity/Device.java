package com.hltc.entity;

/**
 * Device entity. @author MyEclipse Persistence Tools
 */

public class Device implements java.io.Serializable {

	// Fields

	private String deviceId;
	private String name;
	private String remarks;

	// Constructors

	/** default constructor */
	public Device() {
	}

	/** minimal constructor */
	public Device(String deviceId) {
		this.deviceId = deviceId;
	}

	/** full constructor */
	public Device(String deviceId, String name, String remarks) {
		this.deviceId = deviceId;
		this.name = name;
		this.remarks = remarks;
	}

	// Property accessors

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
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