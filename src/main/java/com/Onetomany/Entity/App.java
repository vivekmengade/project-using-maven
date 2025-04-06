package com.Onetomany.Entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		
		
		System.out.println("Start");
		Configuration cfg=new Configuration();
		cfg.configure();
		
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		
		Session session= sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		
		System.out.println("Data Processing.....");
		
		
		
		sf.close();
		tx.commit();
		session.close();
		
		
	}
}
