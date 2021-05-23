/* Example program for Unboxing 
 * 
 * Converting an object of a wrapper type to its 
 * corresponding primitive value is called unboxing.
 * For example conversion of Integer to int.
 * 
 */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
public class UnBoxing {

	public static void main(String[] args) {
		Integer value = 100; // Integer Wrapper class
		int integer1 = value.intValue(); // Unboxing Integer to int
		int integer2 = value; // Auto-Unboxing Integer to int
		System.out.println("Unboxing Integer to int: " + integer1);
		System.out.println("Auto-Unboxing Integer to int: " + integer2);
	}
}
