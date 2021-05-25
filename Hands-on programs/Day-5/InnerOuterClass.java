/* Example program for Non-static nested Classes */
package com.onebill.corejava.basic;

/* This is the Outer class */
class Outerclass {

	/* This is the Inner class is inside the Outer class */
	class Innerclass {
		public void display() {
			System.out.println("This is the Inner class");
		}
	}
}

public class InnerOuterClass {

	public static void main(String[] args) {
		/* Create a new Object for Inner class */
		Outerclass.Innerclass inner = new Outerclass().new Innerclass();
		inner.display();

	}

}
