/* Example program for Addition of two matrix */
package com.onebill.corejava.array;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Get row and column length of the array from user */
		System.out.print("Enter the size of row : ");
		int row = sc.nextInt();
		System.out.print("Enter the size of column : ");
		int column = sc.nextInt();
		int[][] matrix1 = new int[row][column];
		int[][] matrix2 = new int[row][column];
		int[][] matrix3 = new int[row][column];
		System.out.println("Enter the elements for matrix 1");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements for matrix 2");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("\nMatrix 1");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nMatrix 2");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nMatrix 3 = Matrix 1 + Matrix 2");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
