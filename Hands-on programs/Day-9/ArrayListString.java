package com.onebill.corejava.collection;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> arrayString = new ArrayList<String>();
		arrayString.add("Welcome");
		arrayString.add("To");
		arrayString.add("OneBill");
		
		String[] stringArray = new String[arrayString.size()];
		
		for(int i=0;i<stringArray.length;i++) {
			stringArray[i] = arrayString.get(i);
		}
		
		for(String s:stringArray) {
			System.out.println(s);
		}
	}

}
