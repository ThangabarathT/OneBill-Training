package com.onebill.hibernate.PlanSubscriberMapping;

import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.PlanManyToMany;
import com.onebill.hibernate.bean.PlanManytoOne;
import com.onebill.hibernate.bean.PlanOneToMany;
import com.onebill.hibernate.bean.PlanOneToOne;
import com.onebill.hibernate.bean.Subscriber;

/**
 * Hello world!
 *
 */
public class PlanSubscriber {
	static EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("mapplansub");
	static EntityManager entitymanager = entitymanagerfactory.createEntityManager();
	static EntityTransaction entitytransaction = entitymanager.getTransaction();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("This Application use for make relation between Plan and Subscriber");
		System.out.println("Select option to Make Mapping.....");
		System.out.println("Press 1 to Make one-to-one mapping");
		System.out.println("Press 2 to Make one-to-many mapping");
		System.out.println("Press 3 to Make many-to-one mapping");
		System.out.println("Press 4 to Make many-to-many mapping");
		System.out.print("\nPress Key : ");
		int key = Integer.parseInt(sc.nextLine());

		switch (key) {
		case 1:
			oneToOne();
			System.out.println("One to One successfully mapped");
			break;

		case 2:
			oneToMany();
			System.out.println("One to Many successfully mapped");
			break;

		case 3:
			manyToOne();
			System.out.println("Many to One successfully mapped");
			break;

		case 4:
			manyToMany();
			System.out.println("Many to Many successfully mapped");
			break;

		default:
			break;
		}
		sc.close();
	}

	static void oneToOne() {

		System.out.print("\nEnter Plan ID : ");
		int pid = Integer.parseInt(sc.nextLine());

		System.out.print("\nEnter Plan Name : ");
		String pname = sc.nextLine();

		PlanOneToOne plan1 = new PlanOneToOne();
		plan1.setPid(pid);
		plan1.setPname(pname);

		System.out.print("\nEnter Subscriber ID :");
		int sid = Integer.parseInt(sc.nextLine());
		System.out.print("\nEnter Subscriber Name : ");
		String sname = sc.nextLine();

		Subscriber sub1 = new Subscriber();
		sub1.setSid(sid);
		sub1.setSname(sname);

		plan1.setSubscribers(sub1);
		entitytransaction.begin();
		entitymanager.persist(plan1);
		entitytransaction.commit();

	}

	static void oneToMany() {

		System.out.print("\nEnter Plan ID : ");
		int pid = Integer.parseInt(sc.nextLine());

		System.out.print("\nEnter Plan Name : ");
		String pname = sc.nextLine();

		PlanOneToMany plan1 = new PlanOneToMany();
		plan1.setPid(pid);
		plan1.setPname(pname);

		System.out.print("\nNo of Subscriber : ");
		int num = Integer.parseInt(sc.nextLine());

		ArrayList<Subscriber> sub = new ArrayList<Subscriber>();

		for (int i = 1; i <= num; i++) {

			System.out.print("\nEnter Subscriber ID (" + i + ") :");
			int sid = Integer.parseInt(sc.nextLine());
			System.out.print("\nEnter Subscriber Name (" + i + ") : ");
			String sname = sc.nextLine();

			Subscriber sub1 = new Subscriber();
			sub1.setSid(sid);
			sub1.setSname(sname);

			sub.add(sub1);
		}

		plan1.setSubscribers(sub);
		entitytransaction.begin();
		entitymanager.persist(plan1);
		entitytransaction.commit();

	}

	static void manyToOne() {

		System.out.print("\nEnter Subscriber ID :");
		int sid = Integer.parseInt(sc.nextLine());
		System.out.print("\nEnter Subscriber Name : ");
		String sname = sc.nextLine();

		Subscriber sub = new Subscriber();
		sub.setSid(sid);
		sub.setSname(sname);

		System.out.print("\nNo of Plans : ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= num; i++) {

			System.out.print("\nEnter Plan ID (" + i + ") : ");
			int pid = Integer.parseInt(sc.nextLine());
			System.out.print("\nEnter Plan Name  (" + i + ") : ");
			String pname = sc.nextLine();

			PlanManytoOne plan = new PlanManytoOne();
			plan.setPid(pid);
			plan.setPname(pname);

			plan.setSubscribers(sub);

			entitytransaction.begin();
			entitymanager.persist(plan);
			entitytransaction.commit();
		}

	}

	static void manyToMany() {

		ArrayList<Subscriber> sub = new ArrayList<Subscriber>();

		System.out.print("\nNo of Subscribers : ");
		int snum = Integer.parseInt(sc.nextLine());

		for (int j = 1; j <= snum; j++) {

			System.out.print("\nEnter Subscriber ID (" + j + ") :");
			int sid = Integer.parseInt(sc.nextLine());
			System.out.print("\nEnter Subscriber Name (" + j + ") : ");
			String sname = sc.nextLine();

			Subscriber sub1 = new Subscriber();
			sub1.setSid(sid);
			sub1.setSname(sname);

			sub.add(sub1);
		}

		System.out.print("\nNo of Plans : ");
		int pnum = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= pnum; i++) {

			System.out.print("\nEnter Plan ID (" + i + ") : ");
			int pid = Integer.parseInt(sc.nextLine());
			System.out.print("\nEnter Plan Name  (" + i + ") : ");
			String pname = sc.nextLine();

			PlanManyToMany plan = new PlanManyToMany();
			plan.setPid(pid);
			plan.setPname(pname);

			plan.setSubscribers(sub);
			entitytransaction.begin();
			entitymanager.persist(plan);
			entitytransaction.commit();
		}

	}

}
