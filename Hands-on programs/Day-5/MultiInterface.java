/* Example program for Multiple Interfaces */
package com.onebill.corejava.basic;

interface Interface1{
	void method1();
}
interface Interface2{
	void method2();
}
interface Interface3 extends Interface1, Interface2 {
	void method3();
}

class Main implements Interface3{

	@Override
	public void method1() {
		System.out.println("Method1");
	}

	@Override
	public void method2() {
		System.out.println("Method2");
	}

	@Override
	public void method3() {
		System.out.println("Method3");
	}
	
}

public class MultiInterface {

	public static void main(String[] args) {
		Main obj = new Main();
		obj.method1();
		obj.method2();
		obj.method3();
	}

}
