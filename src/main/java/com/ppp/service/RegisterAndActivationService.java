package com.ppp.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ppp.dao.impl.RegisterDao;
import com.ppp.eo.AddressTableEo;
import com.ppp.eo.LoginTableEo;
import com.ppp.eo.RegisterTableEo;
import com.ppp.formBeans.RegisterBean;
import com.ppp.util.Utility;

public class RegisterAndActivationService {
	private RegisterTableEo registerEo;
	private LoginTableEo loginEo;
	private AddressTableEo addressEo;
	private RegisterDao registerDao;
	private Logger logger= LoggerFactory.getLogger(RegisterAndActivationService.class);
	public String doRegister(RegisterBean bean) throws SQLException{
		registerDao= new RegisterDao();
		if(registerDao.duplicateRegisteration(bean.getEmailId()))
			return "DUPLICATE";
		registerEo= new RegisterTableEo();
		loginEo= new LoginTableEo();
		addressEo= new AddressTableEo();
		String user=bean.getEmailId();
		
		registerEo.setEmailId(user);
		registerEo.setRegFname(bean.getFname());
		registerEo.setRegLname(bean.getLname());
		registerEo.setRegmobileNo(bean.getmNum());
		registerEo.setRegDate(new Date());
		registerEo.setRegHashcode(Utility.generateRandomHash());
		
		loginEo.setPassword(bean.getPassword());
		loginEo.setEmailId(bean.getEmailId());
		loginEo.setUserType("REGULAR");	
		loginEo.setAccountStatus("REGISTERED");
		loginEo.setLastLoingOn(new Date());
		registerEo.setLoginTableEo(loginEo);
		
		addressEo.setAdd1(bean.getAdd1());
		addressEo.setAdd2(bean.getAdd2());
		addressEo.setTown(bean.getTown());
		//addressEo.setPincode(bean.getPincode());
		addressEo.setState(bean.getState());
		//addressEo.setEmailId(bean.getEmailId());
		addressEo.setMobileNo(bean.getmNum());
		addressEo.setAddAddedOn(new Date());
		
		List<AddressTableEo> list= new ArrayList<AddressTableEo>();
		list.add(addressEo);
		registerEo.setAddressList(list);
		
		logger.info("Register Eo object created.");
		registerEo=registerDao.doRegister(registerEo);
		if(registerEo!=null){			
		logger.info("Registration successful for user {}",registerEo.getEmailId());
		return "SUCCESS";
		}
		logger.info("Registration unsuccessfull for user {}",user);
		return "FAILED";
		
	}
	
	/*public boolean activateAccount(ActivationBean bean){
		return false;
		
	}*/
}
