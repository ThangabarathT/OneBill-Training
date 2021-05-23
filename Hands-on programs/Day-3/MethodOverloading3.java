/* Example program for Method Overloading 
 * 
 * Method overloading is a feature of Java in which a class has more
 * than one method of the same name and their parameters are different.
 * 
 * Method Overloading - Vary the order of parameter
 * 
 * */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */

/** Create a new Constructor - Overload3 */
class Overload3 {

	/** Method have Order of parameter char and int */
	public void display(char c, int a) {
		System.out.println("Order of parameter char and int");
	}

	/** Method have Order of parameter int and char */
	public void display(int a, char c) {
		System.out.println("Order of parameter int and char");
	}
}

public class MethodOverloading3 {

	public static void main(String[] args) {
		Overload3 obj = new Overload3();
		// Invoke the method with order of argument char and int
		obj.display('a', 10);

		// Invoke the method with order of argument int and char
		obj.display(10, 'a');
	}

}
