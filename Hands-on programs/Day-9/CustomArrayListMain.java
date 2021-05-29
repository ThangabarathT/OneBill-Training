package com.onebill.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CustomArrayListMain {

	public static void main(String[] args) {
		ArrayList<CustomArrayList> student = new ArrayList<CustomArrayList>();
		student.add(new CustomArrayList(30, "Barath"));
		student.add(new CustomArrayList(20, "Sathish"));
		student.add(new CustomArrayList(14, "Ajith"));
		student.add(new CustomArrayList(26, "Surya"));
		/* Without sorting */
		System.out.println("\n-------Normal Order--------");
		for (CustomArrayList s : student) {
			System.out.println(s);
		}

		/* Sorting Ascending Order */
		System.out.println("\n-------Ascending Order--------");
		Collections.sort(student);
		for (CustomArrayList s : student) {
			System.out.println(s);
		}
	}

}
