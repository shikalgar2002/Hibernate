package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Answer;
import com.entity.Question;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Question.class);
		cfg.addAnnotatedClass(Answer.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr  = s.beginTransaction();
		
		Question q = new Question();
		q.setQuestionID(123);
		q.setQuestion("What is java ? ");
		Answer a= new Answer();
		a.setAnswerId(1);
		a.setAnswer("It is a programming language");
		s.persist(a);
		
		
		q.setAnswer(a);	
		s.persist(q);
		tr.commit();
		s.close();
		
		
		
		
		
	}

}
