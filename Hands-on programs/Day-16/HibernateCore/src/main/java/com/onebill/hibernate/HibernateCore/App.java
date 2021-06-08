package com.onebill.hibernate.HibernateCore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onebill.hibernate.bean.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	User u = new User();
    	u.setUserid(1);
    	u.setUsername("Tony Stark");
    	u.setPassword("Tony123");
    	
    	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class);
    	
    	SessionFactory factory = con.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.save(u);
    	transaction.commit();
    	System.out.println("Saved the record Successfully");
    }
}
