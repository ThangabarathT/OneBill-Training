/* Example for Anonymous Inner class using Interface 
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

/* Create a new Interface */
interface Anonymous1 {
	/* Declare a new Method Abstract by Default */
	void method();
}

public class AnonymousInnerClassUseInterface {

	public static void main(String[] args) {
		/* Create a new Object for Interface */
		Anonymous1 obj = new Anonymous1() {
			/* Override the method inside an Object */
			@Override
			public void method() {
				System.out.println("Anonymous Inner class using Interface");
			}
		}; // End of the Object
		obj.method();
	}

}
