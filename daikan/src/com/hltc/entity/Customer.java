package com.hltc.entity;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer customerId;
	private Short staffId;
	private String name;
	private String password;
	private String remarks;
	private Long qq;
	private String tel;
	private String username;
	private String workunit;
	private Short hasStudyVideo;
	private String workStatus;
	private String xindeStatus;
	private String learnStage;
	private String email;
	private Short loginCount;
	private String gender;
	private String title;
	private String subject;
	private String userType;
	private Long lastLogin;
	private Short classId;
	private Short videoTotal;
	private String job;
	private String province;
	private String city;
	private String country;
	private Boolean hasOrder;

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** full constructor */
	public Customer(Short staffId, String name, String password,
			String remarks, Long qq, String tel, String username,
			String workunit, Short hasStudyVideo, String workStatus,
			String xindeStatus, String learnStage, String email,
			Short loginCount, String gender, String title, String subject,
			String userType, Long lastLogin, Short classId, Short videoTotal,
			String job, String province, String city, String country,
			Boolean hasOrder) {
		this.staffId = staffId;
		this.name = name;
		this.password = password;
		this.remarks = remarks;
		this.qq = qq;
		this.tel = tel;
		this.username = username;
		this.workunit = workunit;
		this.hasStudyVideo = hasStudyVideo;
		this.workStatus = workStatus;
		this.xindeStatus = xindeStatus;
		this.learnStage = learnStage;
		this.email = email;
		this.loginCount = loginCount;
		this.gender = gender;
		this.title = title;
		this.subject = subject;
		this.userType = userType;
		this.lastLogin = lastLogin;
		this.classId = classId;
		this.videoTotal = videoTotal;
		this.job = job;
		this.province = province;
		this.city = city;
		this.country = country;
		this.hasOrder = hasOrder;
	}

	// Property accessors

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Short getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Short staffId) {
		this.staffId = staffId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getQq() {
		return this.qq;
	}

	public void setQq(Long qq) {
		this.qq = qq;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getWorkunit() {
		return this.workunit;
	}

	public void setWorkunit(String workunit) {
		this.workunit = workunit;
	}

	public Short getHasStudyVideo() {
		return this.hasStudyVideo;
	}

	public void setHasStudyVideo(Short hasStudyVideo) {
		this.hasStudyVideo = hasStudyVideo;
	}

	public String getWorkStatus() {
		return this.workStatus;
	}

	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}

	public String getXindeStatus() {
		return this.xindeStatus;
	}

	public void setXindeStatus(String xindeStatus) {
		this.xindeStatus = xindeStatus;
	}

	public String getLearnStage() {
		return this.learnStage;
	}

	public void setLearnStage(String learnStage) {
		this.learnStage = learnStage;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Short getLoginCount() {
		return this.loginCount;
	}

	public void setLoginCount(Short loginCount) {
		this.loginCount = loginCount;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Long getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Long lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Short getClassId() {
		return this.classId;
	}

	public void setClassId(Short classId) {
		this.classId = classId;
	}

	public Short getVideoTotal() {
		return this.videoTotal;
	}

	public void setVideoTotal(Short videoTotal) {
		this.videoTotal = videoTotal;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Boolean getHasOrder() {
		return this.hasOrder;
	}

	public void setHasOrder(Boolean hasOrder) {
		this.hasOrder = hasOrder;
	}

}