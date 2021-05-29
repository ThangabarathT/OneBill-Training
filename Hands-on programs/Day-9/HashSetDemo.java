package com.onebill.corejava.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(300);
		hs.add(100);
		hs.add(100);
		hs.add(500);
		hs.add(200);
		hs.add(700);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		hs.remove(null);
		System.out.println(hs);
		System.out.println(hs.size());

		Iterator<Integer> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
