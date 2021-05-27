package com.onebill.corejava.exceptionhandling;

public class TryCatchExceptionDemo1 {

	public static void main(String[] args) {
		try {
		int[] arr = new int[4];
		
		System.out.println("Before....");
		arr[5]=10;
		System.out.println("After....");}
		catch (Exception e) {
			System.out.println("Index out of Bounds error");
		}
	}

}
