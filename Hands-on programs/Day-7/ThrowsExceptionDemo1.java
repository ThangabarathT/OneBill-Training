package com.onebill.corejava.exceptionhandling;

import java.util.Scanner;

class Throws {
	int divition(int num, int den) throws ArithmeticException {
		int quo = num/den;
		return quo;
	}
}

public class ThrowsExceptionDemo1 {

	public static void main(String[] args) {
		int num, den;
		Throws obj = new Throws();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numerator : ");
		num = sc.nextInt();
		System.out.println("Enter the Denomenator :");
		den = sc.nextInt();
		try {
		System.out.println(obj.divition(num, den));}
		catch(ArithmeticException e){
			System.out.println("Not divided");
		}
		System.out.println("Other code....");
		sc.close();
	}

}
