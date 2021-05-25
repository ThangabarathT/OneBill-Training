/* Example program for Inner Class */
package com.onebill.corejava.basics;

/** Create Outer class CPU */
class CPU {
	/* Members for Outer class */
	String manufacture = "Dell";
	int price = 46699;

	/** Create Inner class RAM */
	class RAM {
		/* Members for Inner class RAM */
		String size = "8GB";
		String type = "DDR SDRAM";
		String tech = "DDR4";

		/* Method for Inner class RAM */
		public void ram() {
			System.out.println("RAM size : " + size);
			System.out.println("Memory Type : " + type);
			System.out.println("Memory Technology : " + tech);
		}
	}

	/** Create another Inner class Processor */
	class Processor {
		/* Members for Inner class Processor */
		String processor = "Intel Core i5";
		String type = "Xeon";
		String speed = "3.5 GHz";
		int count = 4;

		/* Method for Inner class Processor */
		public void processor() {
			System.out.println("Processor Name : " + processor);
			System.out.println("Processor Type : " + type);
			System.out.println("Processor Speed : " + speed);
			System.out.println("Processor Count : " + count);
		}
	}

	/* Method for Outer class CPU */
	void display() {
		RAM ram = new RAM();
		Processor pro = new Processor();
		System.out.println("Manufacture : " + manufacture);
		System.out.println("Prize : Rs." + price);
		ram.ram();
		pro.processor();
	}
}

public class MainCPU {

	public static void main(String[] args) {
		/* Create an Object for CPU class */
		CPU cpu = new CPU();
		cpu.display();
	}

}
