package com.hltc.entity;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */

public class Account implements java.io.Serializable {

	// Fields

	private String accountId;
	private String value;
	private String parentId;
	private String hasChild;

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** full constructor */
	public Account(String accountId, String value, String parentId,
			String hasChild) {
		this.accountId = accountId;
		this.value = value;
		this.parentId = parentId;
		this.hasChild = hasChild;
	}

	// Property accessors

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getHasChild() {
		return this.hasChild;
	}

	public void setHasChild(String hasChild) {
		this.hasChild = hasChild;
	}

}