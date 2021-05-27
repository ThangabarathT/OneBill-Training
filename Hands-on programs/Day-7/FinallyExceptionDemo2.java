package com.onebill.corejava.exceptionhandling;

class Finally {
	public static void getExcept(int i) {
		int[] arr = new int[2];
		try {
			switch (i) {
			case 0:
				int ans = 10 / i;
				System.out.println(ans);
				break;
			case 1:
				arr[3] = 10;
				break;
			case 3:
				System.out.println("No Exception");
				break;
			}
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index uot of bound");
		} finally {
			System.out.println("100% execute...");
		}
	}
}

public class FinallyExceptionDemo2 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Finally.getExcept(i);
		}
	}
}
