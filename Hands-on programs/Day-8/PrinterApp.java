package com.onebill.corejava.multithread;

class Printer {
	synchronized void printer( int noOfDoc, String docName) {
		for(int i=1;i<=noOfDoc;i++) {
			System.out.println("...Printing Document..."+docName+" "+i);
		}
	}
}

class Barath extends Thread{
	Printer printRef;
	public Barath(Printer p) {
		printRef = p;
	}
	@Override
	public void run() {
		printRef.printer(10, "Barath.pdf");
	}
}
class Sathish extends Thread{
	Printer printRef;
	public Sathish(Printer p) {
		printRef = p;
	}
	@Override
	public void run() {
		printRef.printer(10, "Sathish.pdf");
	}
}

public class PrinterApp {

	public static void main(String[] args) {
		Printer printer = new Printer();
		Barath thread1 = new Barath(printer);
		Sathish thread2 = new Sathish(printer);
		
		thread1.start();
		thread2.start();
	}

}
