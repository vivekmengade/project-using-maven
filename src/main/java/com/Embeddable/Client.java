package com.Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		System.out.println( "Project Strating..." );
        
        System.out.println("Step_1 Configuration");
        Configuration cfg = new Configuration();
        cfg.configure();
        
        System.out.println("Step - 2 : Build SessionFactory");
        SessionFactory sf= cfg.buildSessionFactory();
        
        System.out.println("Step - 3 : Open Session");
        Session session = sf.openSession();
        
        System.out.println("Step - 4 : Begin Transaction");
        Transaction tx = session.beginTransaction();
        
        
        Student stu = new Student();
        stu.setId(1);
        stu.setName("Ram");
        
        	Course c1 = new Course();
        	c1.setCname("Java Fullstack");
        	c1.setPrice(35000);
        stu.setCourse(c1);
        
        session.save(stu);
        
        
        tx.commit();
        session.clear();
        sf.close();
        System.out.println("END");
	}
}
