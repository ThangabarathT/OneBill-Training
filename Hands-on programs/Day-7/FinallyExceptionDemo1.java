package com.onebill.corejava.exceptionhandling;

public class FinallyExceptionDemo1 {
public static void main(String[] args) {
	try {
		int quo = 25/2;
		System.out.println(quo);
	}catch(ArithmeticException e) {
		System.out.println("Exception....");
	}finally {
		System.out.println("Finally block");
	}
	
}
}
