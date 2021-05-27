package com.onebill.corejava.exceptionhandling;

import java.io.IOException;

public class ThrowsExceptionDemo2 {

	public static char prompt(String str) throws IOException {
		System.out.println(str);
		return (char) (System.in.read());
	}
	
	public static void main(String[] args) {
		char ch;
		try {
			ch=prompt("Enter char : ");
		}catch(IOException e) {
			System.out.println("IO Exception");
			ch = 'X';
		}
		System.out.println("You enterd : "+ch);
	}

}
