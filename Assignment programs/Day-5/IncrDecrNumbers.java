/* Example program for Increasing and Decreasing Order of the Numbers */
package com.onebill.corejava.basics;

import java.util.Scanner;

public class IncrDecrNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of elements : ");
		int range = sc.nextInt();
		System.out.println("Enter the elements one by one");
		int number[] = new int[range];
		int temp = 0;

		/** Store the elements to Array one by one */
		for (int i = 0; i < range; i++) {
			number[i] = sc.nextInt();
		}

		/** Print the elements Neither Increasing nor Decreasing Order */
		System.out.print("Neither Increasing nor Decreasing Order : ");
		for (int j : number) {
			System.out.print(j + "   ");
		}

		/** Sort the Array for Increasing Order */
		for (int k = 0; k < number.length; k++) {
			for (int l = (k + 1); l < number.length; l++) {
				if (number[k] > number[l]) {
					temp = number[k];
					number[k] = number[l];
					number[l] = temp;
				}
			}
		}

		/** Print the Array for Increasing Order */
		System.out.print("\nIncreasing Order : ");
		for (int j : number) {
			System.out.print(j + "   ");
		}

		/** Sort the Array for Decreasing Order */
		for (int k = 0; k < number.length; k++) {
			for (int l = (k + 1); l < number.length; l++) {
				if (number[k] < number[l]) {
					temp = number[k];
					number[k] = number[l];
					number[l] = temp;
				}
			}
		}

		/** Print the Array for Decreasing Order */
		System.out.print("\nDecreasing Order : ");
		for (int j : number) {
			System.out.print(j + "   ");
		}
		sc.close();
	}

}
