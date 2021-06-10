package com.onebill.hibernate.jpahibernate_jql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Employee;

public class GetReference {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		try {
			entitymanagerfactory = Persistence.createEntityManagerFactory("Employee");
			entitymanager = entitymanagerfactory.createEntityManager();

			Employee emp = entitymanager.getReference(Employee.class, 2);

			System.out.println("Employee ID     : " + emp.getId());
			System.out.println("Employee Name   : " + emp.getName());
			System.out.println("Employee Salary : " + emp.getSalary());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
