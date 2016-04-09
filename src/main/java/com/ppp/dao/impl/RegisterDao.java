package com.ppp.dao.impl;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ppp.dao.DaoInterface;
import com.ppp.eo.LoginTableEo;
import com.ppp.eo.RegisterTableEo;

public class RegisterDao implements DaoInterface {
	
	private Session session;
	private Transaction transaction;
	private Logger logger= LoggerFactory.getLogger(RegisterDao.class);

	@Override
	
	public RegisterTableEo doRegister(RegisterTableEo object)
			throws SQLException {
		try{
		logger.info("Going to register user {} and email id is {}",object.getRegFname(),object.getEmailId());
		session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
		transaction=session.beginTransaction();
		session.persist(object);
		session.flush();
		transaction.commit();
		if(session.isConnected())
			session.close();
		logger.info("Detailed save successfully closing session.");		
		return object;
		}catch(Exception ex){
			logger.info(ex.getMessage());
			ex.printStackTrace();
			if(session.isConnected() && transaction!=null){				
				logger.error("Got exception while saving details to database.Rolling back transaction. email id {}",object.getEmailId());
				transaction.rollback();
				session.close();
				
			}
			
		}		
		return null;
	}

	@Override
	public boolean doLogin(LoginTableEo object) throws SQLException {
		
		return false;
	}

	@Override
	public boolean activateAccount(RegisterTableEo object) throws SQLException {
		
		return false;
	}

	@Override
	public RegisterTableEo retrieveRegisterEo(String email) {
		
		return null;
	}
	
	

	
	
}
