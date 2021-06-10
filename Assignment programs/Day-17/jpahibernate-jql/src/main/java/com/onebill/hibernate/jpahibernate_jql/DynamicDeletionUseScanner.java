package com.onebill.hibernate.jpahibernate_jql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeletionUseScanner {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;
		Scanner sc = new Scanner(System.in);

		try {

			entitymanagerfactory = Persistence.createEntityManagerFactory("Employee");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytransaction = entitymanager.getTransaction();
			entitytransaction.begin();

			String query = "delete from Employee where id = :empid";

			Query q = entitymanager.createQuery(query);
			System.out.print("Enter employee ID : ");
			int empid = sc.nextInt();
			q.setParameter("empid", empid);
			int result = q.executeUpdate();
			entitytransaction.commit();
			System.out.println("Deleted row count: " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
