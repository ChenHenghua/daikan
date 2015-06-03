package com.hltc.entity;

/**
 * Telphone entity. @author MyEclipse Persistence Tools
 */

public class Telphone implements java.io.Serializable {

	// Fields

	private TelphoneId id;

	// Constructors

	/** default constructor */
	public Telphone() {
	}

	/** full constructor */
	public Telphone(TelphoneId id) {
		this.id = id;
	}

	// Property accessors

	public TelphoneId getId() {
		return this.id;
	}

	public void setId(TelphoneId id) {
		this.id = id;
	}

}