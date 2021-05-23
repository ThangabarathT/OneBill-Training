/* Example for some Bitwise Operators */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
public class BitwiseDemo {
	public static void main(String[] args) {
		int first = 1;
		int second = 2;
		int third = 3;
		first |= 4;				// first = first | 4
		second >>= 1;			// second = second >> 1
		third <<= 1; 			// third = third << 1
		first ^= third; 		// first = first ^ third
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
}
