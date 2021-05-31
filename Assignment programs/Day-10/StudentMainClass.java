package com.onebill.corejava.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

class SortById implements Comparator<StudentClass> {
	@Override
	public int compare(StudentClass o1, StudentClass o2) {
		return o1.id - o2.id;
	}
}

class SortByName implements Comparator<StudentClass> {
	@Override
	public int compare(StudentClass o1, StudentClass o2) {
		return o1.name.compareTo(o2.name);
	}
}

class SortByMark implements Comparator<StudentClass> {
	@Override
	public int compare(StudentClass o1, StudentClass o2) {
		return o1.mark - o2.mark;
	}
}

class SortByAge implements Comparator<StudentClass> {
	@Override
	public int compare(StudentClass o1, StudentClass o2) {
		return o1.age - o2.age;
	}
}

public class StudentMainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> chlength = new ArrayList<Integer>();
		HashSet<StudentClass> student = new HashSet<StudentClass>();
		// User input
		/*
		 * System.out.print("How many students you add now ? : "); int count =
		 * input.nextInt(); Integer[] charlength = new Integer[]; for (int i = 1; i <=
		 * count; i++) { input.nextLine(); System.out.println("\nEnter the Student (" +
		 * i + ") Details"); System.out.print("Enter Student ID   : "); int id =
		 * Integer.parseInt(input.nextLine());
		 * System.out.print("Enter Student Name : "); String name = input.nextLine();
		 * System.out.print("Enter Student Mark : "); int mark = input.nextInt();
		 * System.out.print("Enter Student age  : "); int age = input.nextInt();
		 * student.add(new StudentClass(id, name, mark, age)); }
		 */
		student.add(new StudentClass(1, "Tony", 98, 31));
		student.add(new StudentClass(4, "Steve", 95, 34));
		student.add(new StudentClass(2, "Bruce", 80, 45));
		student.add(new StudentClass(7, "Clint", 76, 48));
		student.add(new StudentClass(9, "Loki", 50, 36));
		student.add(new StudentClass(6, "Peter", 67, 27));
		for (StudentClass chl : student) {
			chlength.add((chl.name).length());
		}
		Integer max = Collections.max(chlength);
		System.out.println(max);
		System.out.println("\nYour Entered Details are...");
		System.out.println("----------------------------------------");
		System.out.printf("%-5s %-" + (max + 10) + "s %-10s %-10s", "ID", "Student Name", "Mark", "Age");
		for (StudentClass st : student) {
			System.out.printf("\n%-5s %-" + (max + 10) + "s %-10s %-10s", st.id, st.name, st.mark, st.age);
		}
		System.out.println("\n\nIf you want sort this Order(y/n) : ");
		char ch = input.next().charAt(0);
		if ((ch == 'y') || (ch == 'Y')) {
			System.out.println("Options are...\n1. Sort by ID\n2. Sort by Name\n3. Sort by Mark\n4. Sort by Age");
			System.out.println("Select option : ");
			int key = input.nextInt();
			switch (key) {
			case 1:
				System.out.printf("%-5s %-" + (max + 10) + "s %-10s %-10s", "ID", "Student Name", "Mark", "Age");
				TreeSet<StudentClass> sortid = new TreeSet<StudentClass>(new SortById());
				sortid.addAll(student);
				for (StudentClass id : sortid) {
					System.out.printf("\n%-5s %-" + (max + 10) + "s %-10s %-10s", id.id, id.name, id.mark, id.age);
				}
				break;
			case 2:
				System.out.printf("%-5s %-" + (max + 10) + "s %-10s %-10s", "ID", "Student Name", "Mark", "Age");
				TreeSet<StudentClass> sortname = new TreeSet<StudentClass>(new SortByName());
				sortname.addAll(student);
				for (StudentClass name : sortname) {
					System.out.printf("\n%-5s %-" + (max + 10) + "s %-10s %-10s", name.id, name.name, name.mark,
							name.age);
				}
				break;
			case 3:
				System.out.printf("%-5s %-" + (max + 10) + "s %-10s %-10s", "ID", "Student Name", "Mark", "Age");
				TreeSet<StudentClass> sortmark = new TreeSet<StudentClass>(new SortByMark());
				sortmark.addAll(student);
				for (StudentClass mark : sortmark) {
					System.out.printf("\n%-5s %-" + (max + 10) + "s %-10s %-10s", mark.id, mark.name, mark.mark,
							mark.age);
				}
				break;
			case 4:
				System.out.printf("%-5s %-" + (max + 10) + "s %-10s %-10s", "ID", "Student Name", "Mark", "Age");
				TreeSet<StudentClass> sortage = new TreeSet<StudentClass>(new SortByAge());
				sortage.addAll(student);
				for (StudentClass age : sortage) {
					System.out.printf("\n%-5s %-" + (max + 10) + "s %-10s %-10s", age.id, age.name, age.mark, age.age);
				}
				break;

			default:
				System.out.println("You select wrong option..Please try again..");
				break;
			}
		} else {
			System.out.println("----------------Thankyou----------------");
		}
	}

}
