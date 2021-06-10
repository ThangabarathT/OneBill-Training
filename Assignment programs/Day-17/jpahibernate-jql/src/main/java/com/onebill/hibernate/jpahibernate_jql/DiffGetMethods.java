package com.onebill.hibernate.jpahibernate_jql;

import java.util.List;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.bean.Employee;

public class DiffGetMethods {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;

		try {
			entitymanagerfactory = Persistence.createEntityManagerFactory("Employee");
			entitymanager = entitymanagerfactory.createEntityManager();

			String query = "from Employee";
			Query q = entitymanager.createQuery(query);

			System.out.println("-----------getResultList()-----------");
			List<Employee> employee = q.getResultList();
			for (Employee emp : employee) {
				System.out.println(emp.getName());
			}

			System.out.println("\n-----------getClass()-----------");
			Class<? extends Query> getclass = q.getClass();
			System.out.println(getclass);

			System.out.println("\n-----------getFirstResult()-----------");
			int getfirst = q.getFirstResult();
			System.out.println(getfirst);

			System.out.println("\n-----------getFirstResult()-----------");
			int getmax = q.getMaxResults();
			System.out.println(getmax);

			System.out.println("\n-----------getResultStream()-----------");
			Stream getStream = q.getResultStream();
			System.out.println(getStream);
			
			System.out.println("\n-----------getLockMode()-----------");
			LockModeType getLock = q.getLockMode();
			System.out.println(getLock);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
