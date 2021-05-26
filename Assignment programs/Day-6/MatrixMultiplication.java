package com.onebill.corejava.array;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Get row and column length of the array from user */
		System.out.print("Enter the row size of Matrix 1 : ");
		int row1 = sc.nextInt();
		System.out.print("Enter the column size of Matrix 1 : ");
		int column1 = sc.nextInt();
		System.out.print("Enter the row size of Matrix 2 : ");
		int row2 = sc.nextInt();
		System.out.print("Enter the column size of Matrix 2 : ");
		int column2 = sc.nextInt();
		int[][] matrix1 = new int[row1][column1];
		int[][] matrix2 = new int[row2][column2];
		int[][] matrix3 = new int[row1][column2];
		System.out.println("Enter the elements for matrix 1");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements for matrix 2");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<column2;j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column2;j++) {
				matrix3[i][j]=0;
				for(int k=0;k<row2;k++) {
					matrix3[i][j]+= matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		System.out.println("\nMatrix 1");
		for(int i=0;i<row1;i++) {
			System.out.print("| ");
			for(int j=0;j<column1;j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("\nMatrix 2");
		for(int i=0;i<row2;i++) {
			System.out.print("| ");
			for(int j=0;j<column2;j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("\nMatrix 3 = Matrix 1 * Matrix 2");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column2;j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
