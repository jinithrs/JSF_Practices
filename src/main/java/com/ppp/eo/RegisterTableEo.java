package com.ppp.eo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="ppp_register")
public class RegisterTableEo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -705784989039569148L;

	@Transient
	@Column(name="reg_id")
	private Integer regId;
	
	@Id
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="reg_fname")
	private String regFname;
	
	@Column(name="reg_lname")
	private String regLname;
	
	@Column(name="reg_phoneno" )
	private String regmobileNo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="reg_date")
	private Date regDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="reg_activation_date")
	private Date regActDate;	
	
	@Column(name="reg_account_status")
	private String accountStatus="REGISTERED";
	
	@Column(name="reg_user_code")
	private String regHashcode;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="email_id")
	private List<AddressTableEo> addressList;
	
	@OneToOne(fetch =FetchType.LAZY , cascade=CascadeType.ALL)
	@JoinColumn(name="email_id")
	private LoginTableEo loginTableEo;

	/**
	 * @return the regId
	 */
	public Integer getRegId() {
		return regId;
	}

	/**
	 * @param regId the regId to set
	 */
	public void setRegId(Integer regId) {
		this.regId = regId;
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
	 * @return the regFname
	 */
	public String getRegFname() {
		return regFname;
	}

	/**
	 * @param regFname the regFname to set
	 */
	public void setRegFname(String regFname) {
		this.regFname = regFname;
	}

	/**
	 * @return the regLname
	 */
	public String getRegLname() {
		return regLname;
	}

	/**
	 * @param regLname the regLname to set
	 */
	public void setRegLname(String regLname) {
		this.regLname = regLname;
	}

	

	/**
	 * @return the regmobileNo
	 */
	public String getRegmobileNo() {
		return regmobileNo;
	}

	/**
	 * @param regmobileNo the regmobileNo to set
	 */
	public void setRegmobileNo(String regmobileNo) {
		this.regmobileNo = regmobileNo;
	}

	/**
	 * @return the loginEo
	 */
	public LoginTableEo getLoginTableEo() {
		return loginTableEo;
	}

	/**
	 * @param loginEo the loginEo to set
	 */
	public void setLoginTableEo(LoginTableEo loginTableEo) {
		this.loginTableEo = loginTableEo;
	}

	/**
	 * @return the regDate
	 */
	public Date getRegDate() {
		return regDate;
	}

	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	/**
	 * @return the regActDate
	 */
	public Date getRegActDate() {
		return regActDate;
	}

	/**
	 * @param regActDate the regActDate to set
	 */
	public void setRegActDate(Date regActDate) {
		this.regActDate = regActDate;
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

	/**
	 * @return the regHashcode
	 */
	public String getRegHashcode() {
		return regHashcode;
	}

	/**
	 * @param regHashcode the regHashcode to set
	 */
	public void setRegHashcode(String regHashcode) {
		this.regHashcode = regHashcode;
	}

	/**
	 * @return the addressList
	 */
	public List<AddressTableEo> getAddressList() {
		return addressList;
	}

	/**
	 * @param addressList the addressList to set
	 */
	public void setAddressList(List<AddressTableEo> addressList) {
		this.addressList = addressList;
	}

	
	
	
	

}
