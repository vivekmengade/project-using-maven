package com.NativeQueries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Quries.Student;

public class App {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		
		SessionFactory sf= cfg.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Query<Object[]> q1=session.createSQLQuery("select * from Student");
		
		List<Object[]> list=q1.list();
		
		for(Object stu[]:list) {
			System.out.println(stu[0]+" "+stu[1]+" "+stu[2]+" ");
		}
		
		
		
		
		
		tx.commit();
		session.close();
		sf.close();
		
		System.out.println("--------------END--------------");
		
	}
}