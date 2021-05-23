/* Example program for Operators - Evaluate some expressions */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
public class OperatorDemo {

	public static void main(String[] args) {
		int a = 5, b = 2, c = 1, m, n, x = 10, y = 2, p = 2;
		m = ++a * 5; // m = 6 * 5 = 30
		n = b++ - c * 2; // n = 2 - 1 * 2 = 0
		p *= x / y; // p = 20 / 2 = 10 (p = p * x / y)
		System.out.println("++a*5 = " + m);
		System.out.println("b++-c*2 = " + n);
		System.out.println("p*x/y = " + p);

	}

}
