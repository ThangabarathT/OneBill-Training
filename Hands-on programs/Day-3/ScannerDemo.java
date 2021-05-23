/* Example program for Scanner Object */
package com.onebill.corejava.basic;

import java.util.Scanner;

/**
 * @author T. THANGABARATH
 * @version
 */
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Create the Scanner object

		System.out.println("Enter your Name :");
		String name = sc.nextLine(); // Get String data from user

		System.out.println("Enter your gender :");
		char gender = sc.next().charAt(0); // Get Character data from user

		System.out.println("Enter your age :");
		int age = sc.nextInt(); // Get Integer data from user

		System.out.println("Enter your Mobile Number :");
		long mobNo = sc.nextLong(); // Get Long data from user

		System.out.println("Enter your salary :");
		double salary = sc.nextDouble(); // Get Double data from user

		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
		System.out.println("Age : " + age);
		System.out.println("Mobile No : " + mobNo);
		System.out.println("Salary : " + salary);
		sc.close();
	}

}
