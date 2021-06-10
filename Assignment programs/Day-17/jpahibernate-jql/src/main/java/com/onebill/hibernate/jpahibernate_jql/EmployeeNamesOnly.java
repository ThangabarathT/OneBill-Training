package com.onebill.hibernate.jpahibernate_jql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.bean.Employee;

public class EmployeeNamesOnly {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;

		try {
			entitymanagerfactory = Persistence.createEntityManagerFactory("Employee");
			entitymanager = entitymanagerfactory.createEntityManager();

			System.out.println("-----------Use Query----------");
			String query = "select name from Employee";
			Query q = entitymanager.createQuery(query);
			List<String> employee = q.getResultList();
			for (String emp : employee) {
				System.out.println(emp);
			}

			System.out.println("\n--------Use Find Method-------");
			for (int i = 1;; i++) {
				Employee emp = entitymanager.find(Employee.class, i);
				if (emp != null) {
					System.out.println(emp.getName());
				} else {
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
