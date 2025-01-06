package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Students;

public class InsertData {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss =sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Students s= new Students();
		
		s.setName("Ruturaj");
		s.setAge(23);
		s.setAddress("Akurdi");
		
		ss.persist(s);
		tr.commit();
		ss.close();
		System.out.println("Application Started....");
		

	}

}
