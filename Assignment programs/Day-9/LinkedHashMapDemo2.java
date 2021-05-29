package com.onebill.corejava.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {
		LinkedHashMap<Employee, String> emplhm = new LinkedHashMap<Employee, String>();
		emplhm.put(new Employee(1, "Tony Stark"), "Iron Man");
		emplhm.put(new Employee(6, "Steve Rogers"), "Captain America");
		emplhm.put(new Employee(7, "Bruce Banner"), "Hulk");
		emplhm.put(new Employee(9, "Clint Barton"), "Hawkeye");
		emplhm.put(new Employee(4, "Peter Parker"), "Spider Man");
		/* Original Order of LinkedHashMap */
		System.out.println("---------------Original Order------------------");
		Set<Map.Entry<Employee, String>> st = emplhm.entrySet();
		for (Entry<Employee, String> s : st) {
			System.out.println(s);
		}
		/* Ascending Order of LinkedHashMap */
		System.out.println("\n---------------Ascending Order----------------");
		Map<Employee, String> sort = new TreeMap<Employee, String>(emplhm);
		Set<Map.Entry<Employee, String>> set = sort.entrySet();
		for (Entry<Employee, String> s : set) {
			System.out.println(s);
		}
		/* Descending Order of LinkedHashMap */
		System.out.println("\n---------------Ascending Order----------------");
		Map<Employee, String> des = new TreeMap<Employee, String>(emplhm).descendingMap();
		Set<Map.Entry<Employee, String>> desort = des.entrySet();
		for (Entry<Employee, String> s : desort) {
			System.out.println(s);
		}

	}

}
