/* Example program for Interface Inside a Class */
package com.onebill.corejava.basic;

class Test1 {
	/** Interface inside a class */
	interface Interface1 {
		void method1();
	}
}

class Test2 {
	/** Interface inside a class */
	interface Interface2 {
		void method2();
	}
}

class Testing implements Test1.Interface1, Test2.Interface2 {

	@Override
	public void method2() {
		System.out.println("Interface2 inside a Test2 class");

	}

	@Override
	public void method1() {
		System.out.println("Interface1 inside a Test1 class");

	}

}

public class InterfaceInsideClass {

	public static void main(String[] args) {
		Test1.Interface1 obj1 = new Testing();
		Test2.Interface2 obj2 = new Testing();
		obj1.method1();
		obj2.method2();

	}

}
