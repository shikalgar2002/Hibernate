package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Students;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		//{
		Students s = new Students();
		s.setS_id(2);
		s.setName("om");
		s.setAge(22);
		s.setAdress("Pune");
		//}Transient State.
		
		//{
		ss.persist(s);
		//}Persistance State.
		s.setName("salman");
		
		//{
		ss.delete(s);
		
		//}Removed State.
		tr.commit();
		
		//{
		ss.close();
		//}Detatched State.
		sf.close();
	}

}
