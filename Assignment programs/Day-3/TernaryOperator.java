/* Example program for Ternary Operator */
package com.onebill.corejava.basic;

import java.util.Scanner;

/**
 * @author T. THANGABARATH
 * @version
 */
public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Create a Scanner Object
		System.out.println("Enter your mark :");
		int mark = sc.nextInt(); // Get the mark from user
		String result = (mark > 40) ? "You Pass" : "You Fail";
		System.out.println("Result is " + result);
		sc.close();
	}

}
