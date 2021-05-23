/* Example for Island of Isolation 
 * 
 * Object 1 references Object 2 and Object 2 references Object 1.
 * Neither Object 1 nor Object 2 is referenced by any other object.
 * That’s an island of isolation.
 * 
 * */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
public class IslandOfIsolation {
	IslandOfIsolation i;

	public static void main(String[] args) {
		IslandOfIsolation obj1 = new IslandOfIsolation();
		IslandOfIsolation obj2 = new IslandOfIsolation();
		obj1.i = obj2; // Object of obj1 gets a copy of obj2
		obj2.i = obj1; // Object of obj2 gets a copy of obj1

		// Till now no object eligible for garbage collection

		obj1 = null;
		obj2 = null;

		// Now two objects are eligible for garbage collection

		System.gc(); // Calling garbage collector
	}

	@Override
	protected void finalize() throws Throwable {
		/* Method called by the garbage collector on an object */
		System.out.println("Garbage Collected");
	}
}
