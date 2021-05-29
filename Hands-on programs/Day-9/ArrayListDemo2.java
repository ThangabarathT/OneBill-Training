package com.onebill.corejava.collection;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		System.out.println(array);
		
		array.add(10);
		array.add(20);
		array.add(2,30);
		array.add(3,40);
		System.out.println(array);
		
		System.out.println("Set with Index and Elements");
		array.set(2,70);
		System.out.println(array);
		
		java.util.List<Integer> sublist = array.subList(1, 3);
		System.out.println(sublist);
	}

}
