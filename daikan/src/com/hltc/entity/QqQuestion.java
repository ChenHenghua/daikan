package com.hltc.entity;

/**
 * QqQuestion entity. @author MyEclipse Persistence Tools
 */

public class QqQuestion implements java.io.Serializable {

	// Fields

	private String qq;
	private String question;
	private String answer;

	// Constructors

	/** default constructor */
	public QqQuestion() {
	}

	/** minimal constructor */
	public QqQuestion(String qq) {
		this.qq = qq;
	}

	/** full constructor */
	public QqQuestion(String qq, String question, String answer) {
		this.qq = qq;
		this.question = question;
		this.answer = answer;
	}

	// Property accessors

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}