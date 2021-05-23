package com.onebill.corejava.basic;

public class ShortCircuit {
	public static void main(String[] args) {

		if (false && true && true) {
			System.out.println("This will not print");
		} else {
			System.out.println("Thos will print else part");
		}
		if (true || false || false) {
			System.out.println("This will print");
		}
	}
}