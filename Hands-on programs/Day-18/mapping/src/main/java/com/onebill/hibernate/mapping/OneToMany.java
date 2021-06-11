package com.onebill.hibernate.mapping;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Cart;
import com.onebill.hibernate.bean.Item;

public class OneToMany {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;

		Cart c1 = new Cart();
		c1.setCid(100);
		c1.setCname("first");
		
		Cart c2 = new Cart();
		c2.setCid(101);
		c2.setCname("Second");
		
		Cart c3 = new Cart();
		c3.setCid(102);
		c3.setCname("Third");
		
		Item i = new Item();
		i.setId(1001);
		i.setItemname("Dress");
		
		//c1.setItems(i);
		//c2.setItems(i);
		//c3.setItems(i);
		
		ArrayList<Cart> cartlist = new ArrayList<Cart>();
		cartlist.add(c1);
		cartlist.add(c2);
		cartlist.add(c3);
		
		//i.setCart(cartlist);
		
		try {

			entitymanagerfactory = Persistence.createEntityManagerFactory("mapping");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytransaction = entitymanager.getTransaction();
			entitytransaction.begin();
			entitymanager.persist(i);
			entitytransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
