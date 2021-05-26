/* Example program for find length of the array */
package com.onebill.corejava.basics;

public class ArrayLengthDemo {

	public static void main(String[] args) {
		/* Create int array with length 10 */
		int[] list = new int[10];
		/* Create int array with elements */
		int[] array = {1,6,9};
		/* Create two dimension jagged array */
		int[][] two = {
				{1,2,3},
				{1,5,7,8,9},
				{2,6,8,9}
		};
		System.out.println("Length of list : "+list.length);
		System.out.println("Length of array : "+array.length);
		System.out.println("Length of two : "+two.length);
		System.out.println("Length of two[0] : "+two[0].length);
		System.out.println("Length of two[1] : "+two[1].length);
		System.out.println("Length of two[2] : "+two[2].length);
 	}

}
