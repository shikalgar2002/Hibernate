package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Employee;

public class FetchAllRecords {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		String HQLQuery = "from Employee";
		Query<Employee> query=ss.createQuery(HQLQuery,Employee.class);
		List<Employee> list=query.list();
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		tr.commit();
		ss.close();
		
	}

}
