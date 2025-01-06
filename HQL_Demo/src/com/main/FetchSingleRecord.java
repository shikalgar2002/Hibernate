
package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Employee;

public class FetchSingleRecord {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String HQLQuery="from Employee where id =: emp";
		Query<Employee> query=ss.createQuery(HQLQuery,Employee.class);
		query.setParameter("emp", 2);
		
		Employee e=query.getSingleResult();
		System.out.println(e);
		
		
		tr.commit();
		ss.close();
	}
}

