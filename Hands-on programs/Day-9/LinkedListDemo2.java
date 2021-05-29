package com.onebill.corejava.collection;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList<String> strlist = new LinkedList<String>();
		strlist.add("Java");
		strlist.add("Python");
		strlist.add("C++");
		strlist.add("html");
		strlist.add("Ruby");
		
		System.out.println(strlist);
		System.out.println(strlist.get(4));
		strlist.set(4, "SQL");
		System.out.println(strlist);
	}

}
