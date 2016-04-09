package com.ppp.eo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ppp_address")
public class AddressTableEo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8488417909461669571L;


	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="address_id")
	@Id
	private Integer addressId;	
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="address_line_1")
	private String add1;
	
	@Column(name="address_line_2")
	private String add2;
	
	@Column(name="address_town")
	private String town;
	
	@Column(name="address_state")
	private String state;	
	
	@Column(name="address_pin")
	private Integer pincode;
	
	@Column(name="address_mobile_no")
	private String mobileNo;
	
	@Column(name="address_type")
	private String addType="REGISTERED";
	
	@Temporal(TemporalType.DATE)
	@Column(name="address_date")
	private Date addAddedOn;
	
	@Column(name="address_contact_type")
	private String addContactType="DEFAULT";

	/**
	 * @return the addressId
	 */
	public Integer getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
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
	 * @return the add1
	 */
	public String getAdd1() {
		return add1;
	}

	/**
	 * @param add1 the add1 to set
	 */
	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	/**
	 * @return the add2
	 */
	public String getAdd2() {
		return add2;
	}

	/**
	 * @param add2 the add2 to set
	 */
	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the pincode
	 */
	public Integer getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the addType
	 */
	public String getAddType() {
		return addType;
	}

	/**
	 * @param addType the addType to set
	 */
	public void setAddType(String addType) {
		this.addType = addType;
	}

	/**
	 * @return the addAddedOn
	 */
	public Date getAddAddedOn() {
		return addAddedOn;
	}

	/**
	 * @param addAddedOn the addAddedOn to set
	 */
	public void setAddAddedOn(Date addAddedOn) {
		this.addAddedOn = addAddedOn;
	}

	/**
	 * @return the addContactType
	 */
	public String getAddContactType() {
		return addContactType;
	}

	/**
	 * @param addContactType the addContactType to set
	 */
	public void setAddContactType(String addContactType) {
		this.addContactType = addContactType;
	}
	
	
}
