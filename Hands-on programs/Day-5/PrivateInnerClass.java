package com.onebill.corejava.basic;

class Outer2{
	private class Inner2{
		public void display() {
			System.out.println("This is Inner class");
		}
	}
	void print() {
		Inner2 obj = new Inner2();
		obj.display();
	}
}


public class PrivateInnerClass {

	public static void main(String[] args) {
		Outer2 obj = new Outer2();
		obj.print();
	}

}
