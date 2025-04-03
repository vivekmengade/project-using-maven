package com.Embadable2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client2 {

	public static void main(String[] args) {
		
		
		System.out.println("Starting....");
		Configuration cfg=new Configuration();
		cfg.configure();
		
		System.out.println("build sessionfactory");
		SessionFactory sf= cfg.buildSessionFactory();
		
		System.out.println("Open Session");
		Session session= sf.openSession();
		
		System.out.println("begin transaction");
		Transaction tx = session.beginTransaction();
		
		
		System.out.println("Start Crud Operation......");
		
		
		Student2 stu1= new Student2();
		stu1.setId(1);
		stu1.setName("Vivek");
		
		Course2 c1=new Course2();
		c1.setNo(101);
		c1.setCName("Java");
		
		stu1.setCname(c1);
		session.save(stu1);
		
		
		
		
		tx.commit();
		sf.close();
		session.close();
		System.out.println("execution completed");
		
		
		
	}
	
}
