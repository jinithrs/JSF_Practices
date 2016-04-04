package com.ppp.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ppp.dao.HibernateSessionFactory;
import com.ppp.formBeans.RegisterBean;
import com.ppp.messageBeans.RegisterMesageBean;
import com.ppp.validator.AllFormValidator;


 
@ManagedBean(name="registerController")
public class RegisterController {   
	private static Logger logger=LoggerFactory.getLogger(RegisterController.class);
	@ManagedProperty(value="#{RegisterBean}")
	private RegisterBean bean;
	private AllFormValidator validator;
	private RegisterMesageBean messages= new RegisterMesageBean();


	public String registerAction(){
		logger.info("Inside register Action method ");
		validator= new AllFormValidator();
		if(validator.isRegisterFormValid(bean)){
			logger.info("All values are valid ");
			HibernateSessionFactory.getSessionFactory().getCurrentSession();
			return "redirect:login.xhtml";
		}
		else{
			logger.info("Values are not valid redirecting to register page.");
			messages.setStatus(true);
			return "register.xhtml";
		}     	
    }
	
	
	//---------------------------------------getter setters---------------
	/**
	 * @return the bean
	 */
	public RegisterBean getBean() {
		return bean;
	}


	/**
	 * @param bean the bean to set
	 */
	public void setBean(RegisterBean bean) {
		this.bean = bean;
	}
	/**
	 * @return the messages
	 */
	public RegisterMesageBean getMessages() {
		return messages;
	}
	/**
	 * @param messages the messages to set
	 */
	public void setMessages(RegisterMesageBean messages) {
		this.messages = messages;
	}
	
 
    
}