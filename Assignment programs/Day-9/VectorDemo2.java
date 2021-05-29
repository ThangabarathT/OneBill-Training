package com.onebill.corejava.collection;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector<Employee> epvec = new Vector<Employee>();
		epvec.add(new Employee(1, "Tony"));
		epvec.add(new Employee(4, "Steve"));
		epvec.add(new Employee(2, "Bruce"));
		epvec.add(new Employee(7, "Clint"));
		epvec.add(new Employee(9, "Loki"));
		epvec.add(new Employee(6, "Peter"));

		for (Employee emp : epvec) {
			System.out.println(emp);
		}
		System.out.println();
		/* Sorting the Vector with respect to empid */
		System.out.println("Sort Order");
		Collections.sort(epvec);
		for (Employee emp : epvec) {
			System.out.println(emp);
		}
	}

}
