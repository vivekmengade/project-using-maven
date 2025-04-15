package com.Quries;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class App {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		
		SessionFactory sf= cfg.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
//		Student s1=new Student(1,"Vivek",89.0);
//		Student s2=new Student(2,"Nihar",70.0);
//		Student s3=new Student(3,"Amruta",95.0);
//		
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
		
		
//		 Query<Student> q1=session.createQuery("from Student");
//		 List<Student> list=q1.list();
//		 
//		 for(Student stu:list) {
//			 System.out.println(stu);
//		 }
		
		 
//		 Query<Student> q2=session.createQuery("from Student where sid=:x");
//		 
//		 Query<Student> q3=q2.setParameter("x", 1);
//		 
//		 List<Student> list2=q2.list();
//		 
//		for(Student stu:list2) {
//			System.out.println(stu);
//		}
		
		
		
//		Query<Student> q4=session.createQuery("DELETE FROM Student WHERE sid=:y");
//		
//		Query<Student> q5=q4.setParameter("y", 3);
//		q4.executeUpdate();
		
		
//		Update
		Query<Student> q6=session.createQuery("update Student set Sname=:n where sid=:a");
		
		Query<Student> q7=q6.setParameter("n", "Ram");
		Query<Student> q8=q6.setParameter("a", 2);
		
		
		q6.executeUpdate();
		
		
		
		
		
		
		Query<Student> q1=session.createQuery("from Student");
		 List<Student> list=q1.list();
		 
		 for(Student stu:list) {
			 System.out.println(stu);
		 }
		
		
		
		
		
		
		
		tx.commit();
		session.close();
		sf.close();
		
		System.out.println("--------------END--------------");
		
	}
}
