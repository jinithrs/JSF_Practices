package com.ppp.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ppp.bo.ResourceFileNames;
import com.ppp.dao.impl.HibernateSessionFactory;
import com.ppp.formBeans.RegisterBean;
import com.ppp.messageBeans.RegisterMesageBean;
import com.ppp.service.RegisterAndActivationService;
import com.ppp.util.ResourceReader;
import com.ppp.util.Utility;
import com.ppp.validator.AllFormValidator;


 
@ManagedBean(name="registerController")
public class RegisterController {   
	private static Logger logger=LoggerFactory.getLogger(RegisterController.class);
	private ResourceReader reader=new ResourceReader(ResourceFileNames.MESSAGES_PROPETY_FILE);
	@ManagedProperty(value="#{RegisterBean}")
	private RegisterBean bean;
	private AllFormValidator validator;
	@ManagedProperty(value="#{messageBean}")
	private RegisterMesageBean messages;
	private RegisterAndActivationService service=null;


	public String registerAction(){
		logger.info("Inside register Action method ");
		validator= new AllFormValidator();
		if(validator.isRegisterFormValid(bean)){
			logger.info("All values are valid ");
			try{
			HibernateSessionFactory.getSessionFactory().getCurrentSession();
			service= new RegisterAndActivationService();
			String registerMessage=service.doRegister(bean);
			if(registerMessage.equals("SUCCESS")){
				bean.flush();
				messages.setRegisterMessage(reader.getValue("register_confirm_msg"));
			return "register.xhtml";
			}
			else if(registerMessage.equals("DUPLICATE")){
				messages.setRegisterMessage(reader.getValue("register_error_duplicate"));
				return "register.xhtml";
				}
			
			else {
				messages.setRegisterMessage(reader.getValue("register_error_msg"));
				return "register.xhtml";
				}
			}
			catch(Exception ex){
				logger.info("Exception cought in controller");
				logger.error(Utility.stackTracetoString(ex));
				messages.setRegisterMessage(reader.getValue("register_error_msg"));
				return "register.xhtml";
				
			}
		}
		else{
			messages.setRegisterMessage(reader.getValue("register_invalid_input"));
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