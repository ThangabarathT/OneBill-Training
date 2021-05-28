package com.onebill.corejava.multithread;

public class Tables {
	public void printTable(int num) {
		for (int i = 1; i <=10; i++) {
			System.out.println(i * num);
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
