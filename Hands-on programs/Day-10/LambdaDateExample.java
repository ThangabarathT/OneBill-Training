package com.onebill.corejava.java8features;

import java.util.Date;

interface DateFormet {
	int process();

	static Date nowDate() {
		return new Date();

	}

	default String formate(Date date) {
		return date.toString();
	}

	default int calculate(int a, int b) {
		return a + b;
	}
}

public class LambdaDateExample {

	public static void main(String[] args) {
		DateFormet ref = () -> 100;
		System.out.println(ref.process());
		Date date = DateFormet.nowDate();
		System.out.println("Time is : "+date);
		System.out.println(ref.formate(date));
		System.out.println(ref.calculate(20, 10));

	}

}
