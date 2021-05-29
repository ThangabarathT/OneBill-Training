package com.onebill.corejava.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		treeset.add(40);
		treeset.add(30);
		treeset.add(10);
		treeset.add(60);
	//	treeset.add(null);
		treeset.add(90);
		System.out.println(treeset);
		System.out.println("Size : "+treeset.size());
	}

}
