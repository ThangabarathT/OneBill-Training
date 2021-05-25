/* Example program for Interface Inside a Interface */
package com.onebill.corejava.basic;

/** Outer Interface */
interface Outer {
	/* Inner Interface */
	interface Inner {
		void method1();
	}

	void method2();
}

/** Interfaces implements in a class */
class Demo implements Outer, Outer.Inner {

	@Override
	public void method1() {
		System.out.println("Inner Interface");

	}

	@Override
	public void method2() {
		System.out.println("Outer Interface");

	}

}

public class InterfaceInsideInterface {

	public static void main(String[] args) {
		Outer outer;
		Outer.Inner inner;
		Demo demo = new Demo();
		outer = demo;
		inner = demo;
		outer.method2();
		inner.method1();
	}

}
