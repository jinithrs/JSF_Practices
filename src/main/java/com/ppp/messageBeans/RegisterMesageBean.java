package com.ppp.messageBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="messageBean",eager=true)
public class RegisterMesageBean {
	private String registerMessage;
	
	
	private boolean status;

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}	

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getRegisterMessage() {
		return registerMessage;
	}

	public void setRegisterMessage(String registerMessage) {
		this.registerMessage = registerMessage;
	}
	
	

}
