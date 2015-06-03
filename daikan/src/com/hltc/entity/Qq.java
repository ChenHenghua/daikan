package com.hltc.entity;

/**
 * Qq entity. @author MyEclipse Persistence Tools
 */

public class Qq implements java.io.Serializable {

	// Fields

	private String qq;
	private String qqgroup;

	// Constructors

	/** default constructor */
	public Qq() {
	}

	/** minimal constructor */
	public Qq(String qq) {
		this.qq = qq;
	}

	/** full constructor */
	public Qq(String qq, String qqgroup) {
		this.qq = qq;
		this.qqgroup = qqgroup;
	}

	// Property accessors

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getQqgroup() {
		return this.qqgroup;
	}

	public void setQqgroup(String qqgroup) {
		this.qqgroup = qqgroup;
	}

}