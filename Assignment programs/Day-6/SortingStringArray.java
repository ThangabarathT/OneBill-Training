package com.onebill.corejava.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Get length of the array from user */
		System.out.print("Enter the Number of elements : ");
		int range = sc.nextInt();

		System.out.println("Enter the elements one by one");
		String str[] = new String[range];

		/** Store the elements to Array one by one */
		for (int i = 0; i < range; i++) {
			str[i] = sc.next();
		}

		/* Print the original array */
		System.out.print("Original Array : ");
		System.out.println(Arrays.toString(str));

		/** Sort the Array in an Ascending Order */
		for (int k = 0; k < str.length; k++) {
			for (int l = (k + 1); l < str.length; l++) {
				if (str[k].compareTo(str[l]) > 0) {
					String temp = str[k];
					str[k] = str[l];
					str[l] = temp;
				}
			}
		}

		/** Print the Array in an Ascending Order */
		System.out.print("\nAscending Order : ");
		System.out.println(Arrays.toString(str));

		/** Sort the Array in Descending Order */
		for (int k = 0; k < str.length; k++) {
			for (int l = (k + 1); l < str.length; l++) {
				if (str[k].compareTo(str[l]) < 0) {
					String temp = str[k];
					str[k] = str[l];
					str[l] = temp;
				}
			}
		}

		/** Print the Array in Descending Order */
		System.out.print("\nDescending Order : ");
		System.out.println(Arrays.toString(str));
		sc.close();
	}

}
