package com.onebill.hibernate.JPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateRecordDynamic {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;

		try {
			entitymanagerfactory = Persistence.createEntityManagerFactory("Movies");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytransaction = entitymanager.getTransaction();
			entitytransaction.begin();

			String query = "update Movies set mname=:name, mreview=:review, mrating= :rating where mid=:id";

			Query q = entitymanager.createQuery(query);
			q.setParameter("name", args[0]);
			q.setParameter("review", args[1]);
			q.setParameter("rating", Double.parseDouble(args[2]));
			q.setParameter("id", Integer.parseInt(args[3]));

			int noofaffectedrow = q.executeUpdate();

			entitytransaction.commit();
			System.out.println("Rows affected count : " + noofaffectedrow);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
