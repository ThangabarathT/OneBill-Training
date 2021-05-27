package com.onebill.corejava.exceptionhandling;

class ExceptionTest1{
	static void generateException() {
		int[] arr = new int[4];
		System.out.println("Before Exception....");
		arr[3]=10;
		System.out.println("After Exception....");
	}
}

public class TryCatchExceptionDemo3 {

	public static void main(String[] args) {
		try {
		ExceptionTest1.generateException();}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}
		System.out.println("Execution completed");
	}

}
