package com.onebill.corejava.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		int l = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		/* Get length of the array from user */
		System.out.print("Enter the number of elements : ");
		int range = sc.nextInt();

		/* Get array elements from user */
		System.out.println("Enter the elements one by one...");
		int[] array = new int[range];
		for (int i = 0; i < range; i++) {
			array[i] = sc.nextInt();
		}

		/* Print the original array */
		System.out.print("\nOriginal Array : ");
		System.out.print(Arrays.toString(array));
		System.out.println();

		for (int j = 0; j < range-1; j++) {
			for (int k = j + 1; k < range; k++) {
				if (array[j] == array[k]) {
					count++;
				}
			}
		}
		
		if (count != 0) {
			int[] duparr = new int[count];
			for (int j = 0; j < range-1; j++) {
				for (int k = j + 1; k < range; k++) {
					if (array[j] == array[k]) {
						duparr[l] = array[k];
						l++;
					}
				}
			}
			System.out.print("\nDuplicate Array : ");
			System.out.print(Arrays.toString(duparr));
		} else {
			System.out.println("No Duplicate elements");
		}
		sc.close();
	}

}
