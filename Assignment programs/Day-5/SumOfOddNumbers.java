/* Example program for Sum of Odd numbers with range */
package com.onebill.corejava.basics;

import java.util.Scanner;

class SumOfOdd {
	int range;
	long sum = 0;

	void sumOfOdd() {
		System.out.print("Odd Numbers : ");
		for (int i = 1; i <= range; i++) {
			if ((i % 2) != 0) {
				System.out.print(i + ", ");
				sum = sum + i;
			}
		}
		System.out.println("\nSum of Odd Numbers = " + sum);
	}
}

public class SumOfOddNumbers {

	public static void main(String[] args) {
		/* Create an Object for SumOfOdd class */
		SumOfOdd obj = new SumOfOdd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit :");
		obj.range = sc.nextInt(); // Get the value from user
		obj.sumOfOdd();
		sc.close();
	}

}
