package com.onebill.corejava.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lshas = new LinkedHashSet<Integer>();
		/* Add elements in Vector */
		lshas.add(100);
		lshas.add(400);
		lshas.add(700);
		lshas.add(300);
		lshas.add(900);
		lshas.add(600);
		lshas.add(200);
		lshas.add(200);
		lshas.add(null);

		/* Print Linked Hash Set */
		System.out.println("LinkedHashSet : " + lshas);

		/* Remove element */
		System.out.println("\n------Remove element------");
		lshas.remove((Integer) 400);
		System.out.println("LinkedHashSet : " + lshas);

		/* Get size of the Linked Hash Set */
		System.out.println("\nSize of the LinkedHashSet : " + lshas.size());

		Iterator<Integer> itr = lshas.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
