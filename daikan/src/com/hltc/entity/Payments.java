package com.hltc.entity;

/**
 * Payments entity. @author MyEclipse Persistence Tools
 */

public class Payments implements java.io.Serializable {

	// Fields

	private String paymentId;
	private String parentId;
	private String value;
	private String hasChild;

	// Constructors

	/** default constructor */
	public Payments() {
	}

	/** minimal constructor */
	public Payments(String paymentId) {
		this.paymentId = paymentId;
	}

	/** full constructor */
	public Payments(String paymentId, String parentId, String value,
			String hasChild) {
		this.paymentId = paymentId;
		this.parentId = parentId;
		this.value = value;
		this.hasChild = hasChild;
	}

	// Property accessors

	public String getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getHasChild() {
		return this.hasChild;
	}

	public void setHasChild(String hasChild) {
		this.hasChild = hasChild;
	}

}