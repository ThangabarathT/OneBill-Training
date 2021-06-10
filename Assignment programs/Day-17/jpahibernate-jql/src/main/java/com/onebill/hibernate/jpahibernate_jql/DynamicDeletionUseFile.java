package com.onebill.hibernate.jpahibernate_jql;

import java.io.File;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeletionUseFile {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;
		String filename = "Data.txt";
		File file = new File(filename);
		int result = 0;

		try {

			entitymanagerfactory = Persistence.createEntityManagerFactory("Employee");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytransaction = entitymanager.getTransaction();
			entitytransaction.begin();

			String query = "delete from Employee where id = :empid";

			Query q = entitymanager.createQuery(query);

			Scanner Reader = new Scanner(file);
			while (Reader.hasNext()) {
				int empid = Integer.parseInt(Reader.nextLine());
				System.out.println("Employee ID : " + empid);
				q.setParameter("empid", empid);
				result += q.executeUpdate();
			}
			entitytransaction.commit();
			System.out.println("Deleted row count: " + result);
			Reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
