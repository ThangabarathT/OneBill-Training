package com.onebill.corejava.exceptionhandling;

import java.util.Scanner;

public class StudentDetailsUseException {

	static void check(int age, double weight) {
		if ((age < 12) || (weight < 35)) {
			throw new ArithmeticException("Not eligible");
		} else {
			System.out.println("\nYou are eligible for registration");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Gender(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		
		System.out.print("Enter DOB : ");
		String DOB = sc.next();
		
		System.out.print("Enter Weight(kg) : ");
		double weight = sc.nextDouble();
		
		System.out.print("Enter Height(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("\nDetails :-");
		System.out.println("Name      : " + name);
		System.out.println("Gender    : " + gender);
		System.out.println("Age       : " + age);
		System.out.println("DOB       : " + DOB);
		System.out.println("Weight    : " + weight);
		System.out.println("Height    : " + height);
		try {
			check(age, weight);
		} catch (ArithmeticException e) {
			System.out.println("\nYou are Not eligible for registration");
		}
		sc.close();
	}

}
