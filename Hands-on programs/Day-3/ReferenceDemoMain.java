/* Example program for different type of variables */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
class Reference {
	int variable = 10; // instance variable

	int display() {
		double salary = 10000.0; // local variable
		System.out.println("Value is : " + variable);
		System.out.println("Salary is : " + salary);
		return 0;
	}
}

public class ReferenceDemoMain {

	public static void main(String[] args) {
		Reference ref = new Reference(); // reference variable
		System.out.println(ref);
		System.out.println(ref.display());
	}

}
