package com.onebill.hibernate.JPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Movies;

public class SaveRecord {
	public static void main(String[] args) {
		Movies m = new Movies();
		m.setMid(3);
		m.setMname("Ironman");
		m.setMrating(9.5);
		m.setMreview("Good Movie");

		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("Movies");

		EntityManager manager = entitymanagerfactory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(m);
		transaction.commit();
		System.out.println("Record added Successfully!!!");
	}

}
