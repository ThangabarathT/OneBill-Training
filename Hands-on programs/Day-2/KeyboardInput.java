/* Example program for Input from Keyboard or User */
package com.onebill.corejava.basic;

import java.io.IOException;

/**
 * @author T. THANGABARATH
 * @version
 */
public class KeyboardInput {

	public static void main(String[] args) throws IOException {

		char character; // Initialize the character variable
		System.out.println("Enter charecter");
		character = (char) System.in.read(); // Get the input from user
		System.out.println("You entered character : " + character);

	}
}
