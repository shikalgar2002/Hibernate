package com.firstCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Students;

public class CacheClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Students s =ss.get(Students.class, 1);
		System.out.println(s);//getting the details from the database and storing it into cache memory for further use.
		System.out.println("working something...");
		Students s1 =ss.get(Students.class, 1);
		System.out.println(s1);// taking the details from L1 cache memory which was store earlier to save the database round trip
		
		ss.close();
	}

}
