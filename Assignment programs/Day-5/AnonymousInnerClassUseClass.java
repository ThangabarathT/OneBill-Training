/* Example for Anonymous Inner class using class 
 * 
 * A class that have no name is known as anonymous inner class 
 * in java. It should be used if you have to override method of 
 * class or interface
 * 
 * Java Anonymous inner class can be created by two ways:
 * (i) Class (may be abstract or concrete).
 * (ii) Interface
 * 
 */
package com.onebill.corejava.basics;

/* Create a new Abstract Class */
abstract class Anonymous {
	/* Declare a new Abstract Method */
	abstract void method();
}

public class AnonymousInnerClassUseClass {

	public static void main(String[] args) {
		/* Create a new Object for Abstract Class */
		Anonymous obj = new Anonymous() {
			/* Override the method inside an Object */
			@Override
			void method() {
				System.out.println("Anonymous Inner class using class");
			}
		}; // End of the Object
		obj.method();
	}

}
