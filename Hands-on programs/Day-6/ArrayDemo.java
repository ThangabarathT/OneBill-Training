/* Example program for Create array 1 to 10 elements */
package com.onebill.corejava.basics;

public class ArrayDemo {

	public static void main(String[] args) {
		// Define a int array with length 10
		int[] array = new int[10];
		int i;
		for(i=0;i<10;i++) {
			array[i] = i;
		}
		for(i=0;i<10;i++) {
			System.out.println(array[i]);
		}
	}

}
