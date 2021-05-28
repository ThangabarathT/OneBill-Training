package com.onebill.corejava.multithread;

public class MainClassForTable {

	public static void main(String[] args) {
		Tables table = new Tables();

		Runnable ref1 = () -> {
			synchronized (table) {
				System.out.println("Table 2");
				table.printTable(2);
			}
		};
		Runnable ref2 = () -> {
			synchronized (table) {
				System.out.println("\nTable 5");
				table.printTable(5);
			}
		};

		Thread table2 = new Thread(ref1);
		Thread table5 = new Thread(ref2);
		table2.start();
		table5.start();
	}

}
