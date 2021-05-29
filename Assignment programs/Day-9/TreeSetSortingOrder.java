/* Example program for Tree Set sorting */
package com.onebill.corejava.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSortingOrder {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(30);
		tree.add(20);
		tree.add(80);
		tree.add(50);
		tree.add(10);
		tree.add(70);
		tree.add(90);
		tree.add(40);
		tree.add(100);
		tree.add(60);
		/* Normal Ascending Order */
		System.out.println("Tree set Normal");
		System.out.println(tree);

		/* Descending Order */
		Set<Integer> des = (TreeSet<Integer>) tree.descendingSet();
		System.out.println("\nTree set Descending Order");
		System.out.println(des);
	}

}
