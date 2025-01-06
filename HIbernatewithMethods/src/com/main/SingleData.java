package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Students;

public class SingleData {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		Students s = new Students();
		
		int Stud_id=1;
		Students s1= ss.get(Students.class, Stud_id);
		
		System.out.println(s1);

	}

}
