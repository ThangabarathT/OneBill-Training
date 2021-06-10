package com.onebill.hibernate.jpahibernate_jql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Employee;

/**
 * Hello world!
 *
 */
public class FindAllRecordUseFind {
	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		try {
			entitymanagerfactory = Persistence.createEntityManagerFactory("Employee");
			entitymanager = entitymanagerfactory.createEntityManager();

			for (int i = 1;; i++) {
				Employee emp = entitymanager.find(Employee.class, i);
				if (emp != null) {
					System.out.println("Employee ID     : " + emp.getId());
					System.out.println("Employee Name   : " + emp.getName());
					System.out.println("Employee Salary : " + emp.getSalary());
					System.out.println("----------------------------------");
				} else {
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
