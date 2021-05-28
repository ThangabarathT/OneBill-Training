package com.onebill.corejava.multithread;

import java.util.Scanner;

class MinBalance extends Exception {
	MinBalance(String s) {
		super(s);
	}
}

class NoNegativeException extends Exception {
	NoNegativeException(String s) {
		super(s);
	}
}

public class WithdrawDepositThread {
	public static double balance = 1000;
	public static WithdrawDepositThread transaction = new WithdrawDepositThread();

	static class Withdraw extends Thread {
		@Override
		public void run() {
			synchronized (transaction) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter amount you want to withdraw : ");
				double debitAmount = sc.nextDouble();
				try {
					if (debitAmount < 1) {
						throw new NoNegativeException("Transaction Failed");
					} else {
						double debalance = balance - debitAmount;
						try {
							if (debalance < 1000) {
								throw new MinBalance("Less Balace...Can't Withdraw");
							} else {
								balance = debalance;
								System.out
										.println("Rs." + debitAmount + " Withdraw Now Your Balance is Rs." + balance);
							}
						} catch (MinBalance e) {
							System.out.println(e.getMessage());
							System.out.println("You Debit only Rs." + (balance - 1000));
						}
					}
				} catch (NoNegativeException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

	static class Deposit extends Thread {

		@Override
		public void run() {
			synchronized (transaction) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter amount you want to deposit : ");
				double creditAmount = sc.nextDouble();
				try {
					if (creditAmount < 1) {
						throw new NoNegativeException("Deposit Failed");
					} else {
						balance = balance + creditAmount;
						System.out.println("Rs." + creditAmount + " Deposited Now Your Balance is Rs." + balance);
					}
				} catch (NoNegativeException e) {
					System.out.println(e.getMessage());
					System.out.println("Can't Deposit this amount");
				}
			}
		}
	}

	public static void main(String[] args) {
		Deposit deposit = new Deposit();
		Withdraw withdraw = new Withdraw();
		System.out.println("Welcome to our Bank");
		deposit.start();
		withdraw.start();

	}

}
