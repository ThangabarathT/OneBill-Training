package com.onebill.corejava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(20);
		array.add(40);
		array.add(60);
		array.add(80);
		array.add(100);
		
		System.out.println(array);
		
		System.out.println("------For Loop------");
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
		
		System.out.println("------For each loop------");
		for(int i : array) {
			System.out.println(i);
		}
		
		System.out.println("------Itrator-------");
		Iterator<Integer> it1 = array.iterator();
		while( it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("-------List Itrator--------");
		ListIterator<Integer> li = array.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("--------List Itrator Backword-------");
		ListIterator<Integer> li1 = array.listIterator(array.size());
		while(li1.hasPrevious()) {
			System.out.println(li1.previous());
		}
	}

}
