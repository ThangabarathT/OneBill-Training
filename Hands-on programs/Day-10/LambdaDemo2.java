package com.onebill.corejava.java8features;

interface LambdaTest1 {
	void display(int x);

	// Java 1.8 features
	default void defaultMethod() {
		System.out.println("Inside Default method.....");
	}

	// Java 1.8 features
	static void staticMethod() {
		System.out.println("Inside Satic Method.....");
	}
}

public class LambdaDemo2 {
	public static void main(String[] args) {
		LambdaTest1 mylam = (int x) -> {
			System.out.println("Print : " + x);
		};
		mylam.display(20);
		mylam.defaultMethod();
		LambdaTest1.staticMethod();
	}
}
