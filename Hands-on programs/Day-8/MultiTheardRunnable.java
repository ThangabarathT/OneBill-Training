package com.onebill.corejava.multithread;

class MultiThread implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId());
	}
}

public class MultiTheardRunnable {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
		Thread obj = new Thread(new MultiThread());
		obj.start();
		}
	}

}
