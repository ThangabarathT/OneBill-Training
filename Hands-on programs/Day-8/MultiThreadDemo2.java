package com.onebill.corejava.multithread;

class Mythread implements Runnable{
	String threadname;
	public Mythread(String tname) {
		threadname = tname;
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
				System.out.println(threadname+" count "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}

public class MultiThreadDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Thread....");
		Mythread t1 = new Mythread("Child");
		Thread t2 = new Thread(t1);
		Thread t3 = new Thread(t1);
		t2.start();
		t3.start();
	}

}
