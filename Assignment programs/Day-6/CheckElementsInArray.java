/* Example program for Check the element present in array */
package com.onebill.corejava.array;

import java.util.Arrays;
import java.util.Scanner;

public class CheckElementsInArray {

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

		System.out.print("\nIf you want to search element inside array(y/n) : ");
		char key = sc.next().charAt(0);
		if ((key == 'y') | (key == 'Y')) {
			System.out.print("\nWhich element you want to search : ");
			String element = sc.next();
			for (int j = 0; j < range; j++) {
				if (str[j].equals(element)) {
					System.out.println(element + " present in position at " + (j + 1));
				}
			}
		} else {
			System.out.println("Array was Created");
		}
		sc.close();
	}

}
