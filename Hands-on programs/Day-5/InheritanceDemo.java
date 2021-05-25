/* Example program for Inheritance  */
package com.onebill.corejava.basic;

/* Create new Parent class */
class TwoDimention {
	double width;
	double height;

	void dimention() {
		System.out.println("Width and Height is " + width + "," + height);
	}
}

/* Create Child class with extends Parent class */
class Triangular extends TwoDimention {
	String style;

	void showStyle() {
		System.out.println("Style is " + style);
	}

	void area() {
		System.out.println("Area is " + (width * height));
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Triangular t1 = new Triangular();
		Triangular t2 = new Triangular();

		t1.width = 2.5;
		t1.height = 7.9;
		t1.style = "With Border";

		t2.width = 12.4;
		t2.height = 4.7;
		t2.style = "Without Border";

		System.out.println("Triangle 1 properties :");
		t1.dimention();
		t1.area();
		t1.showStyle();
		System.out.println();
		
		System.out.println("Triangle 2 properties :");
		t2.dimention();
		t2.area();
		t2.showStyle();

	}

}
