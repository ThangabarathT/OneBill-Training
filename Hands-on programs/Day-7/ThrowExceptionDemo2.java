package com.onebill.corejava.exceptionhandling;

public class ThrowExceptionDemo2 {
	static void validate(int age) {
		if(age < 18 ) {
			throw new ArithmeticException("Not valid for vote");
		}
		else {
			System.out.println("Welcome to you...");
		}
	}

	public static void main(String[] args) {
		try {
			validate(13);
		} catch (ArithmeticException e) {
			System.out.println("Your age less then 18");
		}
		System.out.println("Other code....");
	}

}
