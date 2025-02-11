package com.Hib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
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
        
        
        
        
        Vehicle v= new Vehicle();
        v.setId(1);
        v.setDate(new Date());
        v.setMilage(250);
        v.setPrice(15.5);
        v.setName("Defender");
        v.setX(159);
        
        
        FileInputStream fi = new FileInputStream("src/main/java/defender.jpg");
        byte b[] = new byte[fi.available()];
        fi.read(b);
        
        v.setImg(b);
        
        session.save(v);
        
        
        
        
        
        tx.commit();
        session.clear();
        sf.close();
    }
}
