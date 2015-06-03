package com.hltc.entity;

/**
 * ServiceType entity. @author MyEclipse Persistence Tools
 */

public class ServiceType implements java.io.Serializable {

	// Fields

	private String serviceTypeId;
	private String projectId;
	private String name;
	private Float price;
	private String remark;

	// Constructors

	/** default constructor */
	public ServiceType() {
	}

	/** minimal constructor */
	public ServiceType(String serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	/** full constructor */
	public ServiceType(String serviceTypeId, String projectId, String name,
			Float price, String remark) {
		this.serviceTypeId = serviceTypeId;
		this.projectId = projectId;
		this.name = name;
		this.price = price;
		this.remark = remark;
	}

	// Property accessors

	public String getServiceTypeId() {
		return this.serviceTypeId;
	}

	public void setServiceTypeId(String serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}