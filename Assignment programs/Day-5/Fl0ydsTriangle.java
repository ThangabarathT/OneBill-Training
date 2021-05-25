/* Example program for Floyd's Triangle */
package com.onebill.corejava.basics;

import java.util.Scanner;

class Floyds {
	int range;
	int k = 1;

	void display() {
		for (int i = 1; i <= range; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}
}

public class Fl0ydsTriangle {

	public static void main(String[] args) {
		/* Create an Object for SumOfOdd class */
		Floyds obj = new Floyds();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		obj.range = sc.nextInt(); // Get the value from user
		obj.display();
		sc.close();
	}

}
