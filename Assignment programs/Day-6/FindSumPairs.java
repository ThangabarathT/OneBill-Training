package com.onebill.corejava.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindSumPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sum value : ");
		int sum = sc.nextInt();
		/* Get length of the array from user */
		System.out.print("Enter the Number of elements : ");
		int range = sc.nextInt();

		System.out.println("Enter the elements one by one");
		int array[] = new int[range];

		/** Store the elements to Array one by one */
		for (int i = 0; i < range; i++) {
			array[i] = sc.nextInt();
		}

		/* Print the original array */
		System.out.print("Original Array : ");
		System.out.println(Arrays.toString(array));

		for (int j = 0; j < (range - 1); j++) {
			for (int k = 0; k < range; k++) {
				if (array[j] + array[k] == sum) {
					System.out.println("Pair (" + array[j] + ", " + array[k] + ")");
				}
			}
		}
		sc.close();
	}

}
