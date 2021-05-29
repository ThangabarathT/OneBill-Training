package com.onebill.corejava.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> has = new HashMap<Integer, String>();
		has.put(1, "One");
		has.put(2, "Two");
		has.put(3, "Three");
		has.put(4, "One");

		Set<Map.Entry<Integer, String>> set = has.entrySet();
		for (Entry<Integer, String> s : set) {
			System.out.println(s.getValue());
		}
	}

}
