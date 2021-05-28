package com.onebill.corejava.multithread;

public class MultiTreadUseSleep extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		MultiTreadUseSleep t1 = new MultiTreadUseSleep();
		MultiTreadUseSleep t2 = new MultiTreadUseSleep();
		t1.start();
		t2.start();
		// t1.run();
		// t2.run();

	}

}
