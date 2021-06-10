package com.onebill.hibernate.JPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteRecordDynamic {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;

		try {

			entitymanagerfactory = Persistence.createEntityManagerFactory("Movies");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytransaction = entitymanager.getTransaction();
			entitytransaction.begin();

			String query = "delete from Movies where mid = :id";

			Query q = entitymanager.createQuery(query);
			q.setParameter("id", Integer.parseInt(args[0]));
			int result = q.executeUpdate();
			entitytransaction.commit();
			System.out.println("Deleted row : " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
