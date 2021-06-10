package com.onebill.hibernate.JPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.bean.Movies;

public class ReadSingleDataByQuery {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("Movies");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();

		String query = "from Movies where mid =1";
		Query q = entitymanager.createQuery(query);

		Movies m = (Movies) q.getSingleResult();
		System.out.println("Movie ID     : " + m.getMid());
		System.out.println("Movie Name   : " + m.getMname());
		System.out.println("Movie Rating : " + m.getMrating());
		System.out.println("Movie Review : " + m.getMreview());
	}

}
