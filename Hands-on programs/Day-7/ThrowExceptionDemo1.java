package com.onebill.corejava.exceptionhandling;

public class ThrowExceptionDemo1 {
	public static void main(String[] args) {
		try {
			System.out.println("Before Exception...");
			throw new ArithmeticException();
		}catch(ArithmeticException e){
			System.out.println("Can't divided");
		}
		System.out.println("Other code...");
	}
}
