/* Example program for Rethrow Exception */
package com.onebill.corejava.exceptionhandling;

public class RethrowException {
	static void div(int a, int b) {
		try {
			int quo = a/b;
			throw new ArithmeticException("Manually Throw");
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurs");
			System.out.println(e.getMessage());
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			div(12,10);
		} catch (Exception e) {
			System.out.println("This is main method");
			System.out.println(e.getMessage());
		}
	}
}
