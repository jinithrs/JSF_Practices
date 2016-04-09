package com.ppp.eo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="ppp_user")
public class LoginTableEo implements Serializable{	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7069531138751023172L;

	@Transient
	@Column(name="user_id")
	private Integer userId;
	
	@Id
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="user_password")
	private String password;

	@Column(name="user_type")
	private String userType;
	
	@Temporal(TemporalType.DATE)
	@Column(name="user_last_login")
	private Date lastLoingOn;

	@Column(name="user_account_status")
	private String accountStatus;
	

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the lastLoingOn
	 */
	public Date getLastLoingOn() {
		return lastLoingOn;
	}

	/**
	 * @param lastLoingOn the lastLoingOn to set
	 */
	public void setLastLoingOn(Date lastLoingOn) {
		this.lastLoingOn = lastLoingOn;
	}

	/**
	 * @return the accountStatus
	 */
	public String getAccountStatus() {
		return accountStatus;
	}

	/**
	 * @param accountStatus the accountStatus to set
	 */
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}


	
	
	
	
}
