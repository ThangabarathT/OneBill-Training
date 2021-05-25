/* Example program for Static Variable in a class */
package com.onebill.corejava.basic;

class Employee {
	int empid;
	String empname;
	static String company = "OneBill"; // Static variable

	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	void display() {
		System.out.println(empid + " " + empname + " " + company);
	}
}

public class StaticVariableDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(123, "Barath");
		Employee emp2 = new Employee(124, "Sathish");
		emp1.display();
		Employee.company = "Test Yentra";
		emp2.display();
	}

}
