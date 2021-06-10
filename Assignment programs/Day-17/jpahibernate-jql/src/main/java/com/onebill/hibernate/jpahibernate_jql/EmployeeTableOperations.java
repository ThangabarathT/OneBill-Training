package com.onebill.hibernate.jpahibernate_jql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeTableOperations {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;

		try {
			entitymanagerfactory = Persistence.createEntityManagerFactory("Employee");
			entitymanager = entitymanagerfactory.createEntityManager();
			// Find Maximum salary
			System.out.println("\n--------Maximum Salary--------");
			String findmax = "select name, salary from Employee where salary = (select max(salary) from Employee)";
			Query max = entitymanager.createQuery(findmax);
			List<Object[]> maxsalary = max.getResultList();

			for (Object[] emp : maxsalary) {
				System.out.println("Employee Name   : " + emp[0]);
				System.out.println("Employee Salary : " + emp[1]);
			}

			// Find Minimum Salary
			System.out.println("\n--------Minimum Salary--------");
			String findmin = "select name, salary from Employee where salary = (select min(salary) from Employee)";
			Query min = entitymanager.createQuery(findmin);
			List<Object[]> minsalary = min.getResultList();

			for (Object[] emp : minsalary) {
				System.out.println("Employee Name   : " + emp[0]);
				System.out.println("Employee Salary : " + emp[1]);
			}

			// Find Average Salary
			System.out.println("\n--------Average Salary--------");
			String findavg = "select avg(salary) from Employee";
			Query avg = entitymanager.createQuery(findavg);
			List<Double> avgsalary = avg.getResultList();
			System.out.println("Average Salary : " + avgsalary.get(0));

			// Sum of salary expenses
			System.out.println("\n--------Sum of Salary--------");
			String findsum = "select sum(salary) from Employee";
			Query sum = entitymanager.createQuery(findsum);
			List<Double> sumsalary = sum.getResultList();
			System.out.println("Average Salary : " + sumsalary.get(0));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
