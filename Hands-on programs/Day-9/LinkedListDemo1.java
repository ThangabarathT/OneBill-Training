package com.onebill.corejava.collection;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);

		System.out.println("------Add with Index------");
		list.add(2, 70);
		list.add(4, 50);
		System.out.println(list);

		System.out.println("-----remove(Index) and remove (Object)-------");
		list.remove();
		list.remove(1);
		list.remove(new Integer(30));
		System.out.println(list);

		System.out.println("-----set at Index------");
		list.set(0, 1);
		System.out.println(list);
		list.add(60);
		list.add(80);
		System.out.println(list);

		System.out.println("-----containsAll------");
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(50);
		ls.add(100);
		System.out.println(list);
		System.out.println(ls);
		System.out.println(list.containsAll(ls));
		System.out.println(list.contains(80));
		System.out.println(list.indexOf(new Integer(50)));

	}

}
