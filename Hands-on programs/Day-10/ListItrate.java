package com.onebill.corejava.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListItrate {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		System.out.println("-------Normal for loop------");
		for(int i=0; i<list.size();i++) {
			System.out.println(i);
		}
		
		System.out.println("\n--------Enhanced for loop-------");
		for(Integer x: list) {
			System.out.println(x);
		}
		
		// Java 1.8 features
		System.out.println("\n-------for Each in Java 1.8");
		list.forEach(i -> System.out.println(i));
		System.out.println();
		list.forEach(System.out::println);
	}

}
