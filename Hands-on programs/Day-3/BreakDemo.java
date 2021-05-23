/* Example for Break Statement */
package com.onebill.corejava.basic;

import java.util.Scanner;

/**
 * @author T. THANGABARATH
 * @version
 */
public class BreakDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			/* Set infinite for loop */
			System.out.println("Enter the character");
			String ch = sc.next();
			if (ch.equals("q")) {
				break; // If input character is equal to 'q' exit for loop
			}
			System.out.println("Your entered is " + ch);
			System.out.println();
		}
		System.out.println("You are exit");
		sc.close(); // Close Scanner sc
	}
}
