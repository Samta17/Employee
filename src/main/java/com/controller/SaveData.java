package com.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.HibernateConfiguration;
import com.entity.Employee;

public class SaveData {

	public static void main(String[] args) {
		
		SessionFactory sf= HibernateConfiguration.getSessionFactory();
		
		List<Employee> emlist = new ArrayList();
		
		Employee employee= new Employee(101, "Samta", 25000, "Developer");
		Employee employee1 = new Employee(102, "Arti", 25000, "Developer");
		Employee employee2 = new Employee(103, "Divya", 20000, "Tester");
		Employee employee3 = new Employee(104, "Pratik", 50000, "HR");
		
		emlist.add(employee);
		emlist.add(employee1);
		emlist.add(employee2);
		emlist.add(employee3);
		
		Session session = sf.openSession();
		
       for (Employee emp : emlist) {
		
    	   session.save(emp);
	}

		session.beginTransaction().commit();

	}

}
