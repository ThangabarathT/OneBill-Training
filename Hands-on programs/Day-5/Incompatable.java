package com.onebill.corejava.basic;

/* Create Parent class */
class First {
	int number;

	public First(int i) {
		number = i;
		System.out.println("This is parent class and i =" + i);
	}
}

/* Create Child class with extends Parent class */
class Second extends First {
	int number;

	public Second(int i) {
		super(i);
		number = i;
		System.out.println("i value in sub class = " + i);
	}
}

public class Incompatable {

	public static void main(String[] args) {
		First obj1 = new First(20);
		First obj2;
		Second obj3 = new Second(40);
		obj2 = obj1;
	}

}
