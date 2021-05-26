package com.onebill.corejava.array;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "java";
		String str3 = str1;
		System.out.println(str2 == str3);
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
	}

}
