/* Example for Character Guessing Game using do-while loop */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
import java.io.IOException;

public class GuessingGame {

	public static void main(String[] args) throws IOException {
		char ch;
		char key = 'K';
		System.out.print("Enter the number of attempts(0-9) : ");
		int n = System.in.read(); // Get the number of attempts from user(0-9)
		int attempts = (n - 48); // Convert the ASCII value to Integer
		System.out.println(attempts);
		int i = 0;
		do {
			System.out.println("Enter the character :");
			do {
				// Get the Character from user(A-Z & a-z)
				ch = (char) System.in.read();
			} while (ch == '\n');
			if (key == ch) {
				// If key is equal to ch loop is exit
				System.out.println("You are won the game");
			} else {
				System.out.println("You are wrong");
				System.out.println("Try again\n");
				i++;
			}
		} while ((key != ch) && (i < attempts));
	}
}
