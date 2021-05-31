package com.onebill.corejava.java8features;

interface LambdaTest{
	void display();
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		// Lambda Expression
		LambdaTest lambda = () -> {
			System.out.println("Inside......");
		};
		lambda.display();
	}

}
