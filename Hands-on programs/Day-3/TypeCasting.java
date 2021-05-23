/* Example program for Type Casting 
 * 
 * Widening Casting (automatically) - converting a smaller type to a larger type size
 * byte -> short -> char -> int -> long -> float -> double
 * 
 * Narrowing Casting (manually) - converting a larger type to a smaller size type
 * double -> float -> long -> int -> char -> short -> byte 
 * 
 */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
public class TypeCasting {
	public static void main(String[] args) {
		double doublevalue = 89.678;
		int integervalue = 100;
		int integer = (int) doublevalue; // Narrowing Casting : double -> int
		double doublev = (double) integervalue; // Widening Casting : int -> double
		System.out.println("Widening Casting " + doublev);
		System.out.println("Narrowing Casting " + integer);
	}
}
