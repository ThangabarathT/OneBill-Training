/* Example program for Shifting Operators */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
public class ShiftOperators {

	public static void main(String[] args) {
		int a, b, c = 0;
		a = 4;
		b = -4;
		System.out.println(a + " = " + Integer.toBinaryString(a));
		System.out.println(b + " = " + Integer.toBinaryString(b));

		c = a << 1; // Bitwise left shift for positive number
		System.out.println(a + " << " + Integer.toBinaryString(c));

		c = b << 1; // Bitwise left shift for negative number
		System.out.println(b + " << " + Integer.toBinaryString(c));

		c = a >> 1; // Bitwise right shift with sign extension for positive number
		System.out.println(a + " >> " + Integer.toBinaryString(c));

		c = b >> 1; // Bitwise right shift with sign extension for negative number
		System.out.println(b + " >> " + Integer.toBinaryString(c));

		c = a >>> 1; // Bitwise right shift with zero extension for positive number
		System.out.println(a + " >>> " + Integer.toBinaryString(c));

		c = b >>> 1; // Bitwise right shift with zero extension for negative number
		System.out.println(b + " >>> " + Integer.toBinaryString(c));
	}

}
