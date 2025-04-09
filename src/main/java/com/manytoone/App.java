package com.manytoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {
        System.out.println("Starting Project......");
        Configuration cfg = new Configuration();
        cfg.configure();
        
        System.out.println("Configuration complete");
        SessionFactory sf = cfg.buildSessionFactory();
        
        System.out.println("Session Factory Built...");
        
        Session session = sf.openSession();
        
        System.out.println("Open Session......=====>>>>");
        
        Transaction tx = session.beginTransaction();
        
        System.out.println("Begin Transaction......=========>>>>>>");
        
        // Create students
        Student st1 = new Student();
//        st1.setName("Vivek");
//        st1.setRno(1);
        
        Student st2 = new Student();
//        st2.setName("Nihar");
//        st2.setRno(2);
        
        Student st3 = new Student();
//        st3.setName("Amruta");
//        st3.setRno(3);
//        
        // Create projects
        Projects pr1 = new Projects();
//        pr1.setName("Hospital");
//        pr1.setPid(1001);
        
        Projects pr2 = new Projects();
//        pr2.setName("Car");
//        pr2.setPid(1002);
        
        // Associate projects with students
        pr1.setStudent(st1);  // Associate pr1 with st1
        pr2.setStudent(st1);  // Associate pr2 with st1

        // Associate students with projects in their list (Bidirectional)
        List<Projects> lst1 = new ArrayList<>();
        lst1.add(pr1);
        lst1.add(pr2);
        st1.setProject(lst1);

        // Now Associate pr2 with student 2 (st2) and pr2 with student 3 (st3)
        List<Projects> lst2 = new ArrayList<>();
        lst2.add(pr2);
        st2.setProject(lst2);
        st3.setProject(lst2);

        // Persist students first to ensure the foreign key can be set in projects
        session.save(st1);
        session.save(st2);
        session.save(st3);
        
        // Persist projects
        session.save(pr1);
        session.save(pr2);
        
        tx.commit();
        session.close();
        sf.close();
        
        System.out.println("End of project");
    }
}
