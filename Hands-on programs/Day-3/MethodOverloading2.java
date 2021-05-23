/* Example program for Method Overloading 
 * 
 * Method overloading is a feature of Java in which a class has more
 * than one method of the same name and their parameters are different.
 * 
 * Method Overloading - Vary the type of parameter
 * 
 * */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */

/** Create a new Constructor - Overload2 */
class Overload2 {

	/** Method have char type parameter */
	public void display(char c) {
		System.out.println("Method have char type parameter");
	}

	/** Method have int type parameter */
	public void display(int a) {
		System.out.println("Method have int type parameter");
	}
}

public class MethodOverloading2 {

	public static void main(String[] args) {
		Overload2 obj = new Overload2();
		obj.display('a'); // Invoke the method with char type argument
		obj.display(10); // Invoke the method with int type argument
	}

}
