package com.onebill.corejava.java8features;

public class ClassA extends ClassB implements InterfaceC, InterfaceD {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.display();
	}
	public void display() {
		System.out.println("display() inside a ClassA");
	}
}
