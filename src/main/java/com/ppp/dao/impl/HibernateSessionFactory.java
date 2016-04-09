package com.ppp.dao.impl;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.JDBCConnectionException;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HibernateSessionFactory {	
	private static SessionFactory sessionFactory=null;
	private static ServiceRegistry serviceRegistry;	
	
	private HibernateSessionFactory(){}
	private static Logger logger=LoggerFactory.getLogger(HibernateSessionFactory.class);
	public static SessionFactory getSessionFactory(){
		if(sessionFactory==null){
			Configuration conf= new Configuration();
				      
		      conf.configure("hibernate.cfg.xml");
		      serviceRegistry = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		      sessionFactory = conf.buildSessionFactory(serviceRegistry);
		
			if(sessionFactory==null){
				throw new JDBCConnectionException("Not able to create Session factory object.", null);				
			}else{
				logger.info("Hibernate Configuration loaded @ "+new Date());
			}
		}
		return sessionFactory;
	}
	
}
