package com.onebill.corejava.array;

import java.util.Scanner;

public class StringContainsChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String : ");
		String str = sc.nextLine();
		System.out.println("Enter the Character Sequence : ");
		String charseq = sc.nextLine();
		System.out.println("Original String : "+str);
		if(str.contains(charseq)) {
			System.out.println("Your String contains Character sequence -"+charseq);
		}
		else {
			System.out.println(charseq+" - Not available in your Original String");
		}
		sc.close();
	}

}
