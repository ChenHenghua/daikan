package com.hltc.entity;

import java.sql.Timestamp;

/**
 * TelphoneId entity. @author MyEclipse Persistence Tools
 */

public class TelphoneId implements java.io.Serializable {

	// Fields

	private String number;
	private String staffId;
	private Timestamp lastSendDate;
	private String isCustomer;
	private String area;
	private String projectId;

	// Constructors

	/** default constructor */
	public TelphoneId() {
	}

	/** full constructor */
	public TelphoneId(String number, String staffId, Timestamp lastSendDate,
			String isCustomer, String area, String projectId) {
		this.number = number;
		this.staffId = staffId;
		this.lastSendDate = lastSendDate;
		this.isCustomer = isCustomer;
		this.area = area;
		this.projectId = projectId;
	}

	// Property accessors

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public Timestamp getLastSendDate() {
		return this.lastSendDate;
	}

	public void setLastSendDate(Timestamp lastSendDate) {
		this.lastSendDate = lastSendDate;
	}

	public String getIsCustomer() {
		return this.isCustomer;
	}

	public void setIsCustomer(String isCustomer) {
		this.isCustomer = isCustomer;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TelphoneId))
			return false;
		TelphoneId castOther = (TelphoneId) other;

		return ((this.getNumber() == castOther.getNumber()) || (this
				.getNumber() != null
				&& castOther.getNumber() != null && this.getNumber().equals(
				castOther.getNumber())))
				&& ((this.getStaffId() == castOther.getStaffId()) || (this
						.getStaffId() != null
						&& castOther.getStaffId() != null && this.getStaffId()
						.equals(castOther.getStaffId())))
				&& ((this.getLastSendDate() == castOther.getLastSendDate()) || (this
						.getLastSendDate() != null
						&& castOther.getLastSendDate() != null && this
						.getLastSendDate().equals(castOther.getLastSendDate())))
				&& ((this.getIsCustomer() == castOther.getIsCustomer()) || (this
						.getIsCustomer() != null
						&& castOther.getIsCustomer() != null && this
						.getIsCustomer().equals(castOther.getIsCustomer())))
				&& ((this.getArea() == castOther.getArea()) || (this.getArea() != null
						&& castOther.getArea() != null && this.getArea()
						.equals(castOther.getArea())))
				&& ((this.getProjectId() == castOther.getProjectId()) || (this
						.getProjectId() != null
						&& castOther.getProjectId() != null && this
						.getProjectId().equals(castOther.getProjectId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getNumber() == null ? 0 : this.getNumber().hashCode());
		result = 37 * result
				+ (getStaffId() == null ? 0 : this.getStaffId().hashCode());
		result = 37
				* result
				+ (getLastSendDate() == null ? 0 : this.getLastSendDate()
						.hashCode());
		result = 37
				* result
				+ (getIsCustomer() == null ? 0 : this.getIsCustomer()
						.hashCode());
		result = 37 * result
				+ (getArea() == null ? 0 : this.getArea().hashCode());
		result = 37 * result
				+ (getProjectId() == null ? 0 : this.getProjectId().hashCode());
		return result;
	}

}