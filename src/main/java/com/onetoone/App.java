package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Embeddable.Student;
import com.onetoone.Entity.Address;
import com.onetoone.Entity.Studento;

public class App {

	public static void main(String[] args) {
		System.out.println("Strating......");
		Configuration cfg=new Configuration();
		cfg.configure();
		
		
		SessionFactory sf= cfg.buildSessionFactory();
		
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
//		Studento stu1= new Studento();
//		stu1.setSid(1);
//		stu1.setName("Vivek");
//		
//		
//		Address add1=new Address();
//		add1.setArea("Mengadewadi");
//		add1.setColony("main chowk");
//		add1.setPincode(412406);
//		
//		stu1.setAdd(add1);
		
		
		
		Studento stu2= new Studento();
		stu2.setSid(2);
		stu2.setName("Nihar");
		
		
		Address add2=new Address();
		add2.setArea("Pune");
		add2.setColony("Wagholi");
		add2.setPincode(412);
		
		stu2.setAdd(add2);
		session.save(stu2);
		session.save(add2);
		
		
		
		
//		session.save(stu1);
//		session.save(add1);
		
		
		
		
		
		tx.commit();
		sf.close();
		session.close();
	}
	
}
