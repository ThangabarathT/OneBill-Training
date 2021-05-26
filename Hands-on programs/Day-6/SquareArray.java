/* Example program for Square value of array elements */
package com.onebill.corejava.basics;

public class SquareArray {

	public static void main(String[] args) {
		int[][] square = new int[10][2];
		int i;
		for (i = 1; i < (10 + 1); i++) {
			square[i][0] = i;
			square[i][1] = i * i;
			System.out.println(square[i][0] + "\t" + square[i][1]);
		}
	}
}
