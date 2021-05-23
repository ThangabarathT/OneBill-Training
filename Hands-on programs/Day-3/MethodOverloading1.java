/* Example program for Method Overloading 
 * 
 * Method overloading is a feature of Java in which a class has more
 * than one method of the same name and their parameters are different.
 * 
 * Method Overloading - Vary the number of parameter
 * 
 * */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */

/** Create a new Constructor - Overload1 */
class Overload1 {

	/** Method have one parameter */
	public void display(char c) {
		System.out.println("Method have 1 parameter");
	}

	/** Method have two parameters */
	public void display(char c, int a) {
		System.out.println("Method have 2 parameters");
	}
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		Overload1 obj = new Overload1();
		obj.display('a'); // Invoke the method with 1 argument
		obj.display('a', 10); // Invoke the method with 2 arguments
	}

}
