package com.onebill.corejava.exceptionhandling;

class ExceptionTest{
	static void generateException() {
		int[] arr = new int[4];
		System.out.println("Before Exception....");
		arr[5]=10;
		System.out.println("After Exception....");
	}
}

public class TryCatchExceptionDemo2 {

	public static void main(String[] args) {
		try {
		ExceptionTest.generateException();}
		catch (Exception e) {
			System.out.println("Exception Occur");
		}
		System.out.println("Execution completed");
	}

}
