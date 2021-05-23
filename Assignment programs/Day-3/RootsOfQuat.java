/* Example program for Find Roots of a Quadratic Equation 
 * 
 * Static import method
 * Formula : x = (-b ± √(b2-4ac)) / (2a)
 * 
 * */
package com.onebill.corejava.basic;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * @author T. THANGABARATH
 * @version
 */
public class RootsOfQuat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, root, result1, result2;
		System.out.println("Enter Value a :");
		a = sc.nextDouble(); // Get "a" value from user

		System.out.println("Enter Value b :");
		b = sc.nextDouble(); // Get "b" value from user

		System.out.println("Enter Value c :");
		c = sc.nextDouble(); // Get "c" value from user

		root = (b * b) - (4 * a * c);
		if (root > 0) {
			result1 = (-b + sqrt(root)) / (2 * a);
			result2 = (-b - sqrt(root)) / (2 * a);
			System.out.println("Root1 = " + result1 + " Root2 = " + result2);
		} else if (root == 0) {
			result1 = (-b + sqrt(root)) / (2 * a);
			System.out.println("Root = " + result1);
		} else {
			double real = -b / (2 * a);
			double imaginary = sqrt(-root) / (2 * a);
			System.out.println("Root1 = " + real + "+" + imaginary + "i");
			System.out.println("Root1 = " + real + "-" + imaginary + "i");
		}
		sc.close();
	}

}
