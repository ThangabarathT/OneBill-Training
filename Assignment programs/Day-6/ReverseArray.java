/* Example program for reverse the original array */
package com.onebill.corejava.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int k = 0;
		Scanner sc = new Scanner(System.in);
		/* Get length of the array from user */
		System.out.print("Enter the number of elements : ");
		int range = sc.nextInt();

		/* Get array elements from user */
		System.out.println("Enter the elements one by one...");
		int[] array = new int[range]; // Original array for store elements
		int[] revArr = new int[range]; // Reverse array for store reversed elements
		for (int i = 0; i < range; i++) {
			array[i] = sc.nextInt();
		}

		/* Print the original array */
		System.out.print("\nOriginal Array : ");
		System.out.print(Arrays.toString(array));
		System.out.println();
 
		for (int j = (range - 1); j >= 0; j--) {
			revArr[k] = array[j];
			k++;
		}
		/** Print the reversed array */
		System.out.print("\nReversed Array : ");
		System.out.print(Arrays.toString(revArr));
		
		System.out.print("\nReversed Array : [");
		for (int j = (range - 1); j > 0; j--) {
			System.out.print(array[j]+", ");
		}
		System.out.print(array[0]+"] // Using for loop");
		sc.close();
	}

}
