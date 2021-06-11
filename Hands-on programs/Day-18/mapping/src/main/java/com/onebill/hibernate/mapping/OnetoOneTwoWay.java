package com.onebill.hibernate.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Cart;
import com.onebill.hibernate.bean.Item;

public class OnetoOneTwoWay {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;

		Cart c = new Cart();
		c.setCid(104);
		c.setCname("first");

		Item i = new Item();
		i.setId(107);
		i.setItemname("Dress");
		
		i.setCart(c);
		//c.setItem(i);

		try {

			entitymanagerfactory = Persistence.createEntityManagerFactory("mapping");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytransaction = entitymanager.getTransaction();
			entitytransaction.begin();
			entitymanager.persist(c);
			entitytransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
