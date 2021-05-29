package com.onebill.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		LinkedHashSet<Employee> empls = new LinkedHashSet<Employee>();
		empls.add(new Employee(1, "Tony"));
		empls.add(new Employee(3, "Steve"));
		empls.add(new Employee(2, "Bruce"));
		empls.add(new Employee(6, "Clint"));
		empls.add(new Employee(4, "Loki"));
		empls.add(new Employee(5, "Peter"));

		System.out.println("\n---------Normal Order----------");
		for (Employee emp : empls) {
			System.out.println(emp);
		}

		/* Sorting using Comparable Method */
		/* Convert LinkedHashSet to List */
		List<Employee> list = new ArrayList<Employee>(empls);
		Collections.sort(list);
		System.out.println("\n---------Ascending Order use Comparable----------");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		/*
		 * We can't sorting the LinkedHashSet.So convert to TreeSet for ascending Order
		 */
		Set<Employee> treeset = new TreeSet<Employee>(empls);
		System.out.println("\n---------Ascending Order use TreeSet-----------");
		for (Employee emp : treeset) {
			System.out.println(emp);
		}
		/* Tree Set ascending to Descending Order */
		Set<Employee> des = ((TreeSet<Employee>) treeset).descendingSet();
		System.out.println("\n---------Descending Order use TreeSet---------");
		for (Employee emp : des) {
			System.out.println(emp);
		}
	}

}
