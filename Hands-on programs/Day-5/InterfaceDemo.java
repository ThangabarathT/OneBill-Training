/* Example program for Interfaces */
package com.onebill.corejava.basic;

interface MyInterface {
	// members - only static and final, public
	void myMethod1(); // abstract by default

	void myMethod2(); // abstract by default
}

public class InterfaceDemo implements MyInterface {

	public static void main(String[] args) {
		MyInterface my = new InterfaceDemo();
		my.myMethod1();
		my.myMethod2();

	}

	@Override
	public void myMethod1() {
		System.out.println("My Method 1");

	}

	@Override
	public void myMethod2() {
		System.out.println("My method 2");

	}

}
