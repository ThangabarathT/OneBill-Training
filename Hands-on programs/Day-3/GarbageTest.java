/* Example for Garbage Collection 
 * 
 * Java garbage collection is the process by which Java programs perform
 * automatic memory management. Java programs compile to bytecode that can
 * be run on a Java Virtual Machine, or JVM for short. When Java programs
 * run on the JVM, objects are created on the heap, which is a portion of
 * memory dedicated to the program. Eventually, some objects will no longer
 * be needed. The garbage collector finds these unused objects and deletes
 * them to free up memory.
 * 
 * */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
public class GarbageTest {

	public static void main(String[] args) {
		GarbageTest obj1 = new GarbageTest();
		GarbageTest obj2 = new GarbageTest();
		obj1 = null;
		System.gc(); // One way to Runs the garbage collector
		obj2 = null;
		Runtime.getRuntime().gc(); // Another way to Runs the garbage collector

	}

	@Override
	protected void finalize() throws Throwable {
		/* Method called by the garbage collector on an object */
		System.out.println("Garbage Collected");
	}

}
