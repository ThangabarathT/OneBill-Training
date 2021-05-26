/* Example Program to Insert an element at a specific position in an Array */
package com.onebill.corejava.array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementInArray {

	public static void main(String[] args) {
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

		/* Get any feedback for insert any element inside the Original array */
		System.out.print("\nIf you want insert any element inside array(y/n) : ");
		char key = sc.next().charAt(0);
		if ((key == 'y') | (key == 'Y')) {

			/* Position at which element is to be inserted */
			System.out.print("\nEnter the position : ");
			int index = sc.nextInt();
			/* Get insert element for user */
			System.out.print("\nEnter the element : ");
			int element = sc.nextInt();
			int[] insert = new int[range + 1];
			for (int i = 0; i < range + 1; i++) {
				if (i < (index - 1)) {
					insert[i] = array[i];
				} else if (i == (index - 1)) {
					insert[i] = element;
				} else {
					insert[i] = array[i - 1];
				}
			}
			/* Print Modified array */
			System.out.print("\nModified Array : ");
			System.out.print(Arrays.toString(insert));
		} else {
			System.out.println("Thank you Array is Created");
		}
		sc.close();
	}

}
