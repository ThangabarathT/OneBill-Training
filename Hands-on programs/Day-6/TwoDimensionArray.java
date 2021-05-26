/* Example program for simple two dimension array */
package com.onebill.corejava.basics;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int[][] tab = new int[3][4];
		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(tab[i][j] + " ");
			}
			System.out.println();
		}
	}

}
