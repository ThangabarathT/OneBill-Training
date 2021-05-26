/* Example program for find minimum and maximum value in array */
package com.onebill.corejava.basics;

public class FindMinMaxInArray {

	public static void main(String[] args) {
		/** Create int array with length 5 */
		int[] num = new int[5];
		int min, max;
		num[0] = 10;
		num[1] = 1;
		num[2] = 50;
		num[3] = 24;
		num[4] = 7;
		min = max = num[0];
		for (int i = 0; i <= 4; i++) {
			if (num[i] < min) {
				min = num[i];
			}
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("Minimum value : " + min + " and Maximum value : " + max);
	}

}
