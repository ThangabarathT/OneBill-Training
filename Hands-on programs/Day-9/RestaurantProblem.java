package com.onebill.corejava.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantProblem {

	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<>();
		ArrayList<Integer> price = new ArrayList<>();
		ArrayList<Integer> selectid = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int id;
		int total = 0;
		char ch = 'y';
		items.add("Chicken Biryani  ");
		price.add(210);
		items.add("Mutton Biryani   ");
		price.add(250);
		items.add("Chicken Family pack");
		price.add(552);
		items.add("Mutton Family pack");
		price.add(576);
		items.add("Egg Biryani     ");
		price.add(154);
		items.add("Veg. Biryani    ");
		price.add(154);
		items.add("Veg. Family pack");
		price.add(383);
		items.add("Veg. Supreme pack");
		price.add(574);

		System.out.println("------Welcome to Paradise------");
		System.out.println("-------------Menu--------------");

		for (int i = 0; i < items.size(); i++) {
			System.out.println((i + 1) + ". " + items.get(i) + "\tRs." + price.get(i));
		}

		System.out.println("\nChoose your favorite");
		do {
			System.out.println("Choose food using menu id");
			id = sc.nextInt();
			if (id <= items.size()) {
				total += price.get(id - 1);
				selectid.add(id - 1);
				System.out.println("If you want add another item(y/n) ?");
				ch = sc.next().charAt(0);
			} else {
				System.out.println("Wrong menu id");
			}
		} while ((ch == 'y') || (ch == 'Y'));

		System.out.println("\nBilled for you Order");
		for (int i = 0; i < selectid.size(); i++) {
			System.out.println((i + 1) + ". " + items.get(selectid.get(i)) + "\tRs." + price.get(selectid.get(i)));
		}
		System.out.println("Total Amount    \tRs." + total+"/-");
		sc.close();
	}

}
