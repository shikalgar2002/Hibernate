package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Students;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		int stud_id=1;
		Students s= ss.get(Students.class, stud_id);
		s.setAddress("Akurdi");
		
		ss.merge(s);
		tr.commit();
		
		ss.close();
		
		System.out.println("Data updates Succesfully...");
		

	}

}
