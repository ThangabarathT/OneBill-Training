/* Example program to sort Array in an Ascending and Descending Order. */
package com.onebill.corejava.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingIntArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Get length of the array from user */
		System.out.print("Enter the Number of elements : ");
		int range = sc.nextInt();

		System.out.println("Enter the elements one by one");
		int number[] = new int[range];
		int temp = 0;

		/** Store the elements to Array one by one */
		for (int i = 0; i < range; i++) {
			number[i] = sc.nextInt();
		}

		/* Print the original array */
		System.out.print("Original Array : ");
		System.out.println(Arrays.toString(number));

		/** Sort the Array in an Ascending Order */
		for (int k = 0; k < number.length; k++) {
			for (int l = (k + 1); l < number.length; l++) {
				if (number[k] > number[l]) {
					temp = number[k];
					number[k] = number[l];
					number[l] = temp;
				}
			}
		}

		/** Print the Array in an Ascending Order */
		System.out.print("\nAscending Order : ");
		System.out.println(Arrays.toString(number));

		/** Sort the Array in Descending Order */
		for (int k = 0; k < number.length; k++) {
			for (int l = (k + 1); l < number.length; l++) {
				if (number[k] < number[l]) {
					temp = number[k];
					number[k] = number[l];
					number[l] = temp;
				}
			}
		}

		/** Print the Array in Descending Order */
		System.out.print("\nDescending Order : ");
		System.out.println(Arrays.toString(number));
		sc.close();
	}

}
