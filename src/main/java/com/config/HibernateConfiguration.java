package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class HibernateConfiguration {
	
	public  static SessionFactory getSessionFactory()
	{
		Configuration cfg = new Configuration();
		
		cfg.configure().addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		
		return sf;
		
	}
	

}
