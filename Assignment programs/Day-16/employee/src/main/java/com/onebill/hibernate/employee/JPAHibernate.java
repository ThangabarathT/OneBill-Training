package com.onebill.hibernate.employee;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Employee;

public class JPAHibernate {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setId(3);
		emp.setName("Peter Parker");
		emp.setSalary(40000);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(emp);
		transaction.commit();
		System.out.println("JPA Hibernate Record saved successfully!!!");
	}

}
