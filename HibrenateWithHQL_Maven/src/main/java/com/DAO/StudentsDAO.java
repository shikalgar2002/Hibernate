package com.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Students;

public class StudentsDAO {
	
	public void insertData() {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		String HQLQuery="insert into Students(name,gender,address)values(:myname,:mygender,:myaddress)";
		MutationQuery mq =ss.createMutationQuery(HQLQuery);
//		mq.setParameter("myid",2);
		mq.setParameter("myname", "Harshad");
		mq.setParameter("mygender", "Male");
		mq.setParameter("myaddress", "Chinchwad");
		mq.executeUpdate();
		System.out.println("Data inserted successfully.....");
		tr.commit();
		ss.close();
		
	}
	
	public void updateData() {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		String HQLQuery="update Students set name=:myname where id=:myid";
		MutationQuery mq=ss.createMutationQuery(HQLQuery);
		mq.setParameter("myname", "Akshay");
		mq.setParameter("myid", 1);
		mq.executeUpdate();
		tr.commit();
		ss.close();
		
	}

	
	public void deleteData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		String HQLQuery="Delete from Students where id=:myid";
		MutationQuery mq=ss.createMutationQuery(HQLQuery);
		mq.setParameter("myid",2);
		mq.executeUpdate();
		tr.commit();
		ss.close();
	}
	
	public void getSingleData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		String HQLQuery=" from Students where id=:myid";
		Query<Students> query=ss.createQuery(HQLQuery,Students.class);
		query.setParameter("myid",3);
		Students s=query.getSingleResult();
		System.out.println(s);
		tr.commit();
		ss.close();
	}
	
	public void getAllData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		String HQLQuery=" from Students ";
		Query<Students> query=ss.createQuery(HQLQuery,Students.class);
		List<Students> sl =query.list();
		
		for (Students students : sl) {
			System.out.println(students);
		}
		tr.commit();
		ss.close();
	}
}
