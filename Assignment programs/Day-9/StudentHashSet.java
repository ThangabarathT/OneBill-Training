package com.onebill.corejava.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class StudentHashSet {

	public static void main(String[] args) {
		HashSet<Student> hash = new HashSet<Student>();
		hash.add(new Student(3, "Peter", 80));
		hash.add(new Student(1, "Steve", 96));
		hash.add(new Student(4, "Tony", 98));
		hash.add(new Student(2, "Bruce", 60));
		hash.add(new Student(5, "Sam", 50));
		/* Sort by Id */
		System.out.println("\n--------Sort by Student Id----------");
		Iterator<Student> itr = hash.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		/* Sort by Name */
		System.out.println("\n--------Sort by Student Name----------");
		TreeSet<Student> namesort = new TreeSet<Student>(new SortStudentName());
		namesort.addAll(hash);
		for (Student name : namesort) {
			System.out.println(name);
		}

		/* Sort by Name */
		System.out.println("\n--------Sort by Student Marks----------");
		TreeSet<Student> marksort = new TreeSet<Student>(new SortStudentMark());
		marksort.addAll(hash);
		for (Student mark : marksort) {
			System.out.println(mark);
		}
	}

}
