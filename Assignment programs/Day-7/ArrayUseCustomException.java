/* Example program for Custom Exception using Array */
package com.onebill.corejava.exceptionhandling;

class NonIntResultException extends Exception {
	NonIntResultException(String s) {
		super(s);
	}
}

public class ArrayUseCustomException {
	public static void main(String[] args) {
		int[] num = { 2, 4, 16, 32, 64, 128, 256, 512 };
		int[] deno = { 2, 0, 4, 4, 0, 8 };
		try {
			for (int i = 0; i < num.length; i++) {
				try {
					if ((num[i] % deno[i]) != 0) {
						throw new NonIntResultException("Result is not Interger");
					} else {
						System.out.println(num[i] + "/" + deno[i] + "=" + num[i] / deno[i]);
					}
				} catch (NonIntResultException e) {
					System.out.println("Invalid result");
				} catch (ArithmeticException e) {
					System.out.println("Can't to be divided by zero");
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dinominator not fount");
			System.out.println("Program terminated");

		}

	}
}
