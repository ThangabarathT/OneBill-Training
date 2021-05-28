package com.onebill.corejava.multithread;


class ThreadControlTest extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
				System.out.println("Thread running "+Thread.currentThread().getName());
			}catch(Exception e) {
				System.out.println("Exception Occurs");
			}
			System.out.println("Print "+i);
		}
	}
}

public class ThreadControl {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ThreadControlTest t1 = new ThreadControlTest();
		ThreadControlTest t2 = new ThreadControlTest();
		ThreadControlTest t3 = new ThreadControlTest();
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(200);
			t2.resume();
		}catch(Exception e) {
			System.out.println("Exception Occurs");
		}
		
	}

}
