/* Example program for this keyword */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
class Student {
	int rollno;
	String name;
	float fees;

	public Student(int rollno, String name, float fees) {
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fees);
	}

}

public class ThisDemo {

	public static void main(String[] args) {
		Student s1 = new Student(12, "Barath", 1200f);
		s1.display();
		Student s2 = new Student(13, "Thangam", 1000f);
		s2.display();
	}

}
