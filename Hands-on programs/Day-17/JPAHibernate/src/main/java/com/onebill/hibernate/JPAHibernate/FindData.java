package com.onebill.hibernate.JPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Movies;

public class FindData {

	public static void main(String[] args) {
		
		EntityManagerFactory entitymanager = Persistence.createEntityManagerFactory("Movies");
		EntityManager manager = entitymanager.createEntityManager();
		
		Movies movie = manager.find(Movies.class, 1);
		System.out.println("Movie ID     : " + movie.getMid());
		System.out.println("Movie Name   : " + movie.getMname());
		System.out.println("Movie Rating : " + movie.getMrating());
		System.out.println("Movie Review : " + movie.getMreview());

	}

}
