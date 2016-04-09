package com.ppp.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ppp.dao.impl.HibernateSessionFactory;
import com.ppp.formBeans.RegisterBean;
import com.ppp.messageBeans.RegisterMesageBean;
import com.ppp.service.RegisterAndActivationService;
import com.ppp.validator.AllFormValidator;


 
@ManagedBean(name="registerController")
public class RegisterController {   
	private static Logger logger=LoggerFactory.getLogger(RegisterController.class);
	@ManagedProperty(value="#{RegisterBean}")
	private RegisterBean bean;
	private AllFormValidator validator;
	private RegisterMesageBean messages= new RegisterMesageBean();
	private RegisterAndActivationService service=null;


	public String registerAction(){
		logger.info("Inside register Action method ");
		validator= new AllFormValidator();
		if(validator.isRegisterFormValid(bean)){
			logger.info("All values are valid ");
			try{
			HibernateSessionFactory.getSessionFactory().getCurrentSession();
			service= new RegisterAndActivationService();			
			if(service.doRegister(bean))
				return "login.xhtml";
			else{
				bean.setFname("Service error.");
				return "register.xhtml";
				}
			}
			catch(Exception ex){
				ex.printStackTrace();
				bean.setFname("Service error.");
				return "register.xhtml";
			}
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