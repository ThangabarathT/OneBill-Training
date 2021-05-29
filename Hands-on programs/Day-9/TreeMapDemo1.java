package com.onebill.corejava.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap<Employee, Integer> tr = new TreeMap<Employee, Integer>();
		tr.put(new Employee(2, "Tony"), 1);
		tr.put(new Employee(4, "Steve"), 2);
		tr.put(new Employee(3, "Bukcy"), 3);
		tr.put(new Employee(1, "Sam"), 4);
		tr.put(new Employee(5, "Peter"), 5);

		Set<Map.Entry<Employee, Integer>> st = tr.entrySet();
		for (Entry<Employee, Integer> s : st) {
			System.out.println(s);
		}
	}

}
