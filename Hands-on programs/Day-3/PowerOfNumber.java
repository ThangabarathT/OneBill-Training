/* Example for Calculate the power of a number using a for loop and while loop */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
public class PowerOfNumber {

	public static void main(String[] args) {
		int i = 0;
		double result = 1;
		int power = 4;
		int base = 2;

		// If exponent is negative number enter "if" statement otherwise "else"
		if (power < 0) {
			while (i > power) {
				result *= (base);
				i--;
			}
			System.out.println(1 / result);
		} else {
			for (i = 0; i < power; i++) {
				result *= (base);
			}
			System.out.println(result);
		}

	}

}
