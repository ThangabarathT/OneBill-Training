package com.onebill.corejava.basics;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of rows : ");
		int rows = sc.nextInt();
		int k = 0;
		int count = 0;
		int count1 = 0;
		System.out.println("\nPyramid :");
		for (int i = 1; i <= rows; ++i) {
			for (int j = 1; j <= rows - i; ++j) {
				// Create space for Beginning of the row
				System.out.print("  ");
				++count;
			}
			while (k != 2 * i - 1) {
				// Print i values
				System.out.print((i) + " ");
				++k;
			}
			count1 = count = k = 0;
			System.out.println();
		}
		sc.close();
	}

}
