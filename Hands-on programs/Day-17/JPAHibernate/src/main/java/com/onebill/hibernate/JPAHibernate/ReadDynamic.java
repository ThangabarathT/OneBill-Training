package com.onebill.hibernate.JPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.bean.Movies;

public class ReadDynamic {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		
		try {
		entitymanagerfactory = Persistence.createEntityManagerFactory("Movies");
		entitymanager = entitymanagerfactory.createEntityManager();
		
		String query = "from Movies where mid = :movieid";
		
		Query q = entitymanager.createQuery(query);
		
		q.setParameter("movieid", Integer.parseInt(args[0]));
		
		Movies m = (Movies)q.getSingleResult();
		
		System.out.println("Movie ID     : " + m.getMid());
		System.out.println("Movie Name   : " + m.getMname());
		System.out.println("Movie Rating : " + m.getMrating());
		System.out.println("Movie Review : " + m.getMreview());
		
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
