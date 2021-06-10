package com.onebill.hibernate.JPAHibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.bean.Movies;

public class ReadAllData {

	public static void main(String[] args) {

		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("Movies");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();

		String query = "from Movies";

		Query q = entitymanager.createQuery(query);
		@SuppressWarnings("unchecked")
		List<Movies> result = q.getResultList();
		
		for (Movies m : result) {
			System.out.println("--------------------------------");
			System.out.println("Movie ID     : " + m.getMid());
			System.out.println("Movie Name   : " + m.getMname());
			System.out.println("Movie Rating : " + m.getMrating());
			System.out.println("Movie Review : " + m.getMreview());
			
		}
	}
}
