package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.HibernateConfiguration;
import com.entity.Employee;

public class GetData {

	public static void main(String[] args) {
	 
		SessionFactory sf= HibernateConfiguration.getSessionFactory();
		
		Session session = sf.openSession();
		
		Employee employee = session.get(Employee.class, 104);
		
		System.out.println(employee);
	}

}
