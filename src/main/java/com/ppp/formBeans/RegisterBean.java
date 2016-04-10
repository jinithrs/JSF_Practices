package com.ppp.formBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="RegisterBean")
public class RegisterBean {
	private String fname;
	private String lname;
	private String mNum;
	private String add1;
	private String add2;
	private String town;
	private String state;
	private String pincode;
	private String emailId;
	private String password;
	private String confPass;
	
	public void flush(){
		this.fname="";
		this.lname="";
		this.mNum="";
		this.add1="";
		this.add2="";
		this.town="";
		this.state="";
		this.pincode="";
		this.emailId="";
		this.password="";
		this.confPass="";
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the mNum
	 */
	public String getmNum() {
		return mNum;
	}
	/**
	 * @param mNum the mNum to set
	 */
	public void setmNum(String mNum) {
		this.mNum = mNum;
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
	public String getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
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
	 * @return the confPass
	 */
	public String getConfPass() {
		return confPass;
	}
	/**
	 * @param confPass the confPass to set
	 */
	public void setConfPass(String confPass) {
		this.confPass = confPass;
	}
	
	

}
