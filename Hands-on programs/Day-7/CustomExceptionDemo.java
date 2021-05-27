package com.onebill.corejava.exceptionhandling;

class CustomException extends Exception {
	CustomException(String s) {
		super(s);
	}
}

class Test {
	public static void test(int num) throws CustomException {
		if (num < 35) {
			throw new CustomException("Fail");
		} else {
			System.out.println("Pass");
		}
	}
}

public class CustomExceptionDemo {
	public static void main(String[] args) {
		try {
			Test.test(33);
		} catch (CustomException e) {
			System.out.println("You Fail");
			
		}
	}
}
