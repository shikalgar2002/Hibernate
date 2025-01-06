package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Employee;

public class DeleteRecord {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss  = sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		String HQLQuery="Delete from Employee where id=: emp";
//		Query query=ss.createQuery(HQLQuery);
//		query.setParameter("emp", 1);
//		int result = query.executeUpdate(); 
		
		MutationQuery mq =ss.createMutationQuery(HQLQuery);
		mq.setParameter("emp", 1);
		int result=mq.executeUpdate();
		tr.commit();
		ss.close();
	}
}
