package com.Onetomany.Entity;

import java.util.ArrayList;
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
//		employee obj
		Employee emp1=new Employee();
		emp1.setEid(1);
		emp1.setEName("Vivek");
		
		
		
//		project obj
		Project p1=new Project();
		p1.setPid(1001);
		p1.setPname("Medical");
		
		
		Project p2=new Project();
		p2.setPid(1002);
		p2.setPname("Car ");
		
		
		Project p3=new Project();
		p3.setPid(1003);
		p3.setPname("Hospital");
		
		
		
		p1.setEId(emp1);
//		project List
		List<Project> list1=new ArrayList<Project>();
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		
//		emp1.setProject(list1);
		p1.setEId(emp1);
		p2.setEId(emp1);
		p3.setEId(emp1);
		
		emp1.setProject(list1);
		
		
		
		
		
//		save all
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(emp1);
		
		
		
		
		
		tx.commit();
		session.close();
		sf.close();
		
		System.out.println("Completed.");
		
		
	}
}
