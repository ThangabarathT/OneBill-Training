package com.onebill.hibernate.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onebill.hibernate.bean.Employee;

/**
 * Hello world!
 *
 */
public class Hibernate {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Tony Stark");
		emp.setSalary(60000);
		/*emp.setId(2);
		emp.setName("Steve Roreges");
		emp.setSalary(55000);*/
		System.out.println(emp.toString());
		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(emp);
		transaction.commit();
		System.out.println("Hibernate Record saved successfully!!!");
	}
}
