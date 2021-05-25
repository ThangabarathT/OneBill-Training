/* Example program for Static Method in a class */
package com.onebill.corejava.basic;

class Employee1 {
	int empid;
	String empname;
	static String company = "OneBill";
	static void changename(){
		company = "Test Yentra";
	}
	public Employee1(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	void display() {
		System.out.println(empid+" "+empname+" "+company);
	}
}

public class StaticMethodDemo {

	public static void main(String[] args) {
		Employee1.changename();
		Employee1 emp1 = new Employee1(123, "Barath");
		Employee1 emp2 = new Employee1(124, "Sathish");
		emp1.display();
		emp2.display();
	}

}
