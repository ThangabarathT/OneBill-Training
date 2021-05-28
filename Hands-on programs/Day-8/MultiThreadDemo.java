package com.onebill.corejava.multithread;

public class MultiThreadDemo implements Runnable {
	
	public static void main(String[] args) {
		Thread t1 = new Thread("First");
		Thread t2 = new Thread("Second");
		t1.start();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		t2.start();
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
