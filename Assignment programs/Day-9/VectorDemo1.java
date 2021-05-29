package com.onebill.corejava.collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		/* Create an empty vector */
		Vector<Integer> vec = new Vector<Integer>();

		/* Add elements in Vector */
		vec.add(100);
		vec.add(400);
		vec.add(700);
		vec.add(300);
		vec.add(900);
		vec.add(600);
		vec.add(200);
		vec.add(200);

		/* Print Vector */
		System.out.println("Vector : " + vec);

		/* Capacity of Vector */
		System.out.println("\n------Capacity of Vector------");
		System.out.println("Capacity : " + vec.capacity());
		System.out.println("Size : " + vec.size());

		/* Add element with Index */
		System.out.println("\n------Add element with index------");
		vec.add(2, 500);
		vec.add(6, 800);
		System.out.println("Vector : " + vec);

		/* Replace element with Index */
		System.out.println("\n------Replce element with index------");
		vec.set(0, 80);
		vec.set(4, 70);
		System.out.println("Vector : " + vec);

		/* Remove elements from Vector */
		System.out.println("\n-------Remove elements from Vector--------");
		System.out.println("Removed : " + vec.remove(1));
		vec.remove((Integer) 800);
		System.out.println("Vector : " + vec);

		/* Get elements from Vector using Index Value */
		System.out.println("\n----Get elememnts from Vector using Index----");
		System.out.println("Element in 3rd Position : " + vec.get(2));

		/* Get Hashcode of the Vector */
		System.out.println("\n-----Hashcode of the Vector-----");
		System.out.println("Hash code : " + vec.hashCode());

		/* Get Index of the element in Vector */
		System.out.println("\n-------Find Index of the elements-------");
		System.out.println("Index of 200 : " + vec.indexOf((Integer) 200));
		System.out.println("Index of 200 : " + vec.lastIndexOf((Integer) 200));

		/* Sorting the Vector */
		System.out.println("\n----------Sorting Vector-----------");
		Collections.sort(vec);
		System.out.println("Vector : " + vec);

		/* Traversing elements using for loop */
		System.out.println("\n-----------Use for loop-------------");
		for (Integer s : vec) {
			System.out.println(s);
		}
		/* Traversing elements using Enumeration */
		System.out.println("\n-----------Use Enumeration------------");
		Enumeration<Integer> e = vec.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
