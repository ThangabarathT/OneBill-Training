/* Example program for Autoboxing 
 * 
 * Converting a primitive value into an object of the corresponding
 * wrapper class is called autoboxing. For example, converting 
 * int to Integer class.
 * 
 */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
public class AutoBoxing {

	public static void main(String[] args) {
		int value = 250; // primitive int value
		char ch = 'T'; // primitive char value
		Integer integer1 = new Integer(value); // boxing int to Integer class
		Integer integer2 = value; // auto-boxing int to Integer class
		Character ch1 = ch; // auto-boxing char to Character class
		System.out.println("Boxing: " + integer1);
		System.out.println("AutoBoxing - int to Integer: " + integer2);
		System.out.println("AutoBoxing - char to Character: " + ch1);

	}

}