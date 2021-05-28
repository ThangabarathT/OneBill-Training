package com.onebill.corejava.multithread;

class MultiThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId());
	}
}

public class MultiThreadExtendsThread {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
		MultiThread1 obj = new  MultiThread1();
		obj.start();
		}
	}

}
