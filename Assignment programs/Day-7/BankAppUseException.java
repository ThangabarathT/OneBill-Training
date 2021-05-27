/* Example program for Bank Transaction Application */
package com.onebill.corejava.exceptionhandling;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

public class BankAppUseException {
	static double balance;
	static double creditAmount;
	static double debitAmount;
	static ArrayList<String> history = new ArrayList<String>();
	static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	static Scanner sc = new Scanner(System.in);

	static void credit() {
		System.out.print("Enter amount you want to credit : ");
		creditAmount = sc.nextDouble();
		try {
			if (creditAmount < 1) {
				throw new NoNegativeException("Transaction Failed");
			} else {
				Date date = new Date();
				String time = (formatter.format(date));
				balance = balance + creditAmount;
				history.add(time + " Rs." + creditAmount + " Credited Balance Rs." + balance);
				System.out.println("Your Balance is Rs."+balance);
			}
		} catch (NoNegativeException e) {
			System.out.println(e.getMessage());
		}
	}

	static void debit() {
		System.out.print("Enter amount you want to debit : ");
		debitAmount = sc.nextDouble();
		try {
			if (debitAmount < 1) {
				throw new NoNegativeException("Transaction Failed");
			} else {
				double debalance = balance - debitAmount;
				try {
					if (debalance < 1000) {
						throw new MinBalance("Less Balace...Transaction Failed");
					} else {
						Date date = new Date();
						String time = (formatter.format(date));
						balance = debalance;
						history.add(time + " Rs." + debitAmount + " Debited Balance Rs." + balance);
						System.out.println("Your Balance is Rs."+balance);
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

	static void history() {
		if (history.isEmpty()) {
			System.out.println("No history");
		} else {
			for (String str : history) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		balance = 1000;
		char ch = ' ';
		do {
			System.out.println("Main Menu\nChoose anyone of key");
			System.out.println("1. Credit\n2. Debit\n3. Check Balance\n4. History ");
			System.out.print("\nEnter key : ");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				credit();
				System.out.println("Do to want continue(y/n)");
				ch = sc.next().charAt(0);
				break;
			case 2:
				debit();
				System.out.println("Do to want continue(y/n)");
				ch = sc.next().charAt(0);
				break;
			case 3:
				Date date = new Date();
				String time = (formatter.format(date));
				history.add(time+" Check your balance Rs."+balance);
				System.out.println("Your Balance is Rs."+balance);
				System.out.println("Do to want continue(y/n)");
				ch = sc.next().charAt(0);
				break;	
			case 4:
				history();
				System.out.println("Do to want continue(y/n)");
				ch = sc.next().charAt(0);
				break;

			default:
				System.out.println("Invalid Key please try again\n");
				ch = 'y';
				break;
			}
		} while ((ch == 'y') || (ch == 'Y'));
		System.out.println("Exit");
		sc.close();
	}

}
