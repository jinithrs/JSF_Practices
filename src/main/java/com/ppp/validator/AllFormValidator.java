package com.ppp.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ppp.formBeans.RegisterBean;
import com.ppp.util.Validator;

public class AllFormValidator {
	public static Logger logger= LoggerFactory.getLogger(AllFormValidator.class);
	public boolean isRegisterFormValid(RegisterBean bean){
		boolean status=true;
		
		
		if(!Validator.isNameValid(bean.getFname())){
			logger.error("Fname is not valid "+bean.getFname());
			status=false;
			return status;
		}
		if(!Validator.isNameValid(bean.getLname())){
			logger.error("lname is not valid "+bean.getLname());
			status=false;
			return status;
		}
		if(!Validator.isPhoneNumberValid(bean.getmNum())){
			logger.error("Phone number is not valid "+bean.getmNum());
			status=false;
			return status;
		}
		if(!Validator.isAddressValid(bean.getAdd1())){
			logger.error("Address1 is not valid "+bean.getAdd1());
			status=false;
			return status;
		}
		if(!Validator.isAddressValid(bean.getAdd2())){
			logger.error("Address2 is not valid "+bean.getAdd2());
			status=false;
			return status;
		}
		if(!Validator.isNameValid(bean.getTown())){
			logger.error("Town is not valid "+bean.getTown());
			status=false;
			return status;
		}
		if(!Validator.isNumberValid(bean.getPincode())){
			logger.error("Pincode is not valid "+bean.getPincode());
			status=false;
			return status;
		}
		if(!Validator.isEmailIdValid(bean.getEmailId())){
			logger.error("Email id is not valid "+bean.getEmailId());
			status=false;
			return status;
		}
		if(!Validator.bothEqual(bean.getPassword(), bean.getConfPass())){
			logger.error("Both password doesn't match ");
			status=false;
			return status;
		}
		return status;
	}

}
