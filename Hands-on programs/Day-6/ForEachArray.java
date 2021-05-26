/* Example program for find sum and average of the array using for and enhanced for loop */
package com.onebill.corejava.basics;

public class ForEachArray {

	public static void main(String[] args) {
		/* Create an Array with elements */
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int sum =0;
		double avg = 0;
		
		/** Find sum and average using for loop */
		for(int i=0;i<10;i++) {
			sum = sum + array[i];
			avg = sum/array.length;
		}
		System.out.println("Sum = "+sum);
		System.out.println("Average "+avg);
		
		/** Find sum and average using enhanced for loop */
		for(int x:array) {
			sum = sum + x;
			avg = sum/array.length;
			
		}
		System.out.println("Sum = "+sum);
		System.out.println("Average "+avg);
	}

}
