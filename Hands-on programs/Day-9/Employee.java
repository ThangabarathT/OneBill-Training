package com.onebill.corejava.collection;

public class Employee implements Comparable<Employee> {
	int empid;
	String empname;

	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.empname = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.empid - o.empid;
	}

	@Override
	public int hashCode() {
		return this.empid;
	}
}
