/* Example program for to Convert String to ASCII and ASCII to String value */
package com.onebill.corejava.array;

import java.util.Arrays;
import java.util.Scanner;

public class EncodeDecodeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String string = sc.nextLine();
		byte[] ascii = new byte[string.length()];
		for (int i=0;i<string.length();i++) {
			ascii[i]=(byte) string.charAt(i);
		}
		System.out.println("\nEncoded String to ASCII : ");
		System.out.println(Arrays.toString(ascii));
		String str = new String(ascii);
		System.out.println("\nDecoded ASCII to String : ");
		System.out.println(str);
		sc.close();
	}

}
