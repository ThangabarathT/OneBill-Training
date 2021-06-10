package com.onebill.hibernate.JPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Movies;

public class UpdateRecord {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;
		
		try {
			entitymanagerfactory = Persistence.createEntityManagerFactory("Movies");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytransaction = entitymanager.getTransaction();
			entitytransaction.begin();
			Movies movie = entitymanager.find(Movies.class, 2);
			movie.setMname("Mersal");
			entitymanager.persist(movie);
			entitytransaction.commit();
			System.out.println("Update Successfully");
		}catch(Exception e) {
			
		}


	}

}
