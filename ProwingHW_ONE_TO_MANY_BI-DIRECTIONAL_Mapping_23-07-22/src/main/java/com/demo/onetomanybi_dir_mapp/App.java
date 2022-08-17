package com.demo.onetomanybi_dir_mapp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NamedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
    	System.out.println( "Hello World!" );
        
        Laptop l1 = new Laptop();
        l1.setLname("Sony");
        l1.setPrice(11000);
        
        Laptop l2 = new Laptop();
        l2.setLname("Acer");
        l2.setPrice(12000);
        
        Laptop l3 = new Laptop();
        l3.setLname("Dell");
        l3.setPrice(13000);

        Laptop l4 = new Laptop();
        l4.setLname("Apple");
        l4.setPrice(133000);
        
        Laptop l5 = new Laptop();
        l5.setLname("Samsung");
        l5.setPrice(156400);
        
        Laptop l6 = new Laptop();
        l6.setLname("Lenovo");
        l6.setPrice(114650);
        
        List<Laptop> lap1 = new ArrayList<Laptop>();
        lap1.add(l1);
        lap1.add(l4);
        
        List<Laptop> lap2 = new ArrayList<Laptop>();
        lap2.add(l2);
        lap2.add(l5);
        
        List<Laptop> lap3 = new ArrayList<Laptop>();
        lap3.add(l3);
        lap3.add(l6);
        
        Student std1 = new Student();
        std1.setName("Shubham");
        std1.setLaptop(lap1);
        l1.setStd(std1);
        l4.setStd(std1);
        
        Student std2 = new Student();
        std2.setName("Omkar");
        std2.setLaptop(lap2);
        l2.setStd(std2);
        l5.setStd(std2);
        
        Student std3 = new Student();
        std3.setName("Vaibhav");
        std3.setLaptop(lap3);
        l3.setStd(std3);
        l6.setStd(std3);
        
        Configuration con = new Configuration().configure(); //.addAnnotatedClass(Laptop.class)
        SessionFactory sf = con.buildSessionFactory();
        
        Session session1 =  sf.openSession();
        Transaction tx = session1.beginTransaction(); 
      
        session1.save(std1);
        session1.save(std2);
        session1.save(std3);
      //  session1.delete(std1);
        tx.commit();
        session1.close();
       // System.out.println(ltop);
        sf.close();
        System.out.println("Done");
       
    
    }																																			
}
