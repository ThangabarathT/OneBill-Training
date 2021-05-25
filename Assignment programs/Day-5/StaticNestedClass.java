/* Example program for Static nested class 
 * 
 * Define a class within another class, such classes are known 
 * as nested classes. Nested classes that are declared static are 
 * called static nested classes.
 * 
 * */
package com.onebill.corejava.basics;

/** Create a Outer Class */
class Static {
	int number_1 = 10; // Instance variable
	static int number_2 = 20; // Static variable
	private static int number_3 = 30; // Private variable

	/** Create a static nested class */
	static class StaticInner {
		void display() {
			// This method access the static variable only
			System.out.println("Number_2 = " + number_2);
			System.out.println("Number_3 = " + number_3);
		}
	}

	void print() {
		System.out.println("Number_1 = " + number_1);
	}
}

public class StaticNestedClass {

	public static void main(String[] args) {
		/* Create an Object for Outer class */
		Static obj1 = new Static();

		/* Create an Object for Static nested class */
		Static.StaticInner obj2 = new Static.StaticInner();
		obj1.print();
		obj2.display();

	}

}
