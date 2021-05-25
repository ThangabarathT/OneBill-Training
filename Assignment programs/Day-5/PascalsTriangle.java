/* Example program for Pascal's Triangle */

package com.onebill.corejava.basics;

import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of rows : ");
		int rows = sc.nextInt();
		int num = 1;
		System.out.println("\nPascal's Triangle ");
		for (int i = 0; i < rows; i++) {
			for (int j = 1; j < rows - i; ++j) {
				// Create space for Beginning of the row
				System.out.print("  ");
			}

			for (int k = 0; k <= i; k++) {
				if (k == 0 || i == 0)
					num = 1;
				else
					num = num * (i - k + 1) / k;

				System.out.printf("%4d",num);
			}

			System.out.println();
		}
		sc.close();
	}
}
