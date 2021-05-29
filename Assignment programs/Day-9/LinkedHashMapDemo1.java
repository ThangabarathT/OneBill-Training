package com.onebill.corejava.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1, "Tony Stark");
		lhm.put(3, "Steve Rogers");
		lhm.put(4, "Bruce Banner");
		lhm.put(2, "Thor");
		lhm.put(6, "Nick Fury");
		lhm.put(5, "Peter Parker");
		/* Print LinkedHashMap */
		System.out.println(lhm);
		System.out.println("Size : " + lhm.size());

		Set<Map.Entry<Integer, String>> lhmset = lhm.entrySet();
		for (Entry<Integer, String> map : lhmset) {
			System.out.println(map.getValue());
		}
		/* Get Keys and Values */
		System.out.println("\nKeys: " + lhm.keySet());
		System.out.println("\nValues: " + lhm.values());
		System.out.println();

		/* Remove elements from LinkedHaspMap */
		System.out.println("\n---------Remove elements from LinkedHashMap---------");
		lhm.remove(6);
		for (Entry<Integer, String> map : lhmset) {
			System.out.println(map.getValue());
		}

		/* Update the Value with key */
		System.out.println("\n----------Update the Value using key----------");
		lhm.put(5, "Peter");
		lhm.remove(6);
		for (Entry<Integer, String> map : lhmset) {
			System.out.println(map.getValue());
		}

		/* Replace Value using key */
		System.out.println("\n--------Replace Value using key---------");
		lhm.replace(5, "Sam Willson");
		for (Entry<Integer, String> map : lhmset) {
			System.out.println(map.getValue());
		}

	}

}
