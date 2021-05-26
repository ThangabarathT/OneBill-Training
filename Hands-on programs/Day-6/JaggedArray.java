/* Example program for Jagged Array */
package com.onebill.corejava.basics;

import java.util.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] jagged = new int[3][];
		jagged[0] = new int[] { 1, 2, 3 };
		jagged[1] = new int[] { 4, 7, 9, 3 };
		jagged[2] = new int[] { 1, 3 };
		for (int i = 0; i < 3; i++) {
			System.out.println(Arrays.toString(jagged[i]));
		}
		for (int[] x : jagged) {
			System.out.println(Arrays.toString(x));
		}
	}

}
