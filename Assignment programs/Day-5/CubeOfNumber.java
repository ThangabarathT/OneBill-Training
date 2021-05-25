/* Example program for Find the cube of the numbers */
package com.onebill.corejava.basics;

import java.util.Scanner;

/** Create a class Cube */
class Cube {
	int range;

	void calculateCube() {
		System.out.print("Number : ");
		for (int i = 1; i <= range; i++) {
			System.out.print(i + "\t");
		}
		System.out.print("\nCube   : ");
		for (int j = 1; j <= range; j++) {
			System.out.print((j * j * j) + "\t");
		}
	}
}

public class CubeOfNumber {

	public static void main(String[] args) {
		/* Create an Object for Cube class */
		Cube obj = new Cube();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit :");
		obj.range = sc.nextInt(); // Get the value from user
		obj.calculateCube();
		sc.close();

	}

}
