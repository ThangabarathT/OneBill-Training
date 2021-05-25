/* Example program for Abstract Class 
 * 
 * Abstract class: is a restricted class that cannot be used 
 * to create objects (to access it, it must be inherited from 
 * another class)
 * 
 * Abstract method: can only be used in an abstract class, 
 * and it does not have a body. The body is provided by the 
 * subclass (inherited from).
 * 
 */

package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */

// Create new abstract class
abstract class Shape {
	// Create new abstract method
	abstract void draw();
}

/* Create Rectangle class with extends abstract class */
class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw the rectangle here...");

	}

}

/* Create Triangle class with extends abstract class */
class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw the triangle here...");
	}

}

public class AbstractClass {

	public static void main(String[] args) {
		Rectangle obj1 = new Rectangle();
		Triangle obj2 = new Triangle();
		obj1.draw();
		obj2.draw();

	}

}
