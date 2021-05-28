package com.onebill.corejava.multithread;

public class RunnableThreadMain {

	public static void main(String[] args) {
		RunnableThread1 t1 = new RunnableThread1();
		RunnableThread2 t2 = new RunnableThread2();
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		
		tt1.start();
		tt2.start();

	}

}
