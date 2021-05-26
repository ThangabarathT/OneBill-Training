package com.onebill.corejava.basics;

public class ImmutableString {

	public static void main(String[] args) {
		String s1=new String("Java");
		String s2 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1+" and "+s2);
		
		s2.concat(" Project");
		System.out.println(s1.equals(s2));
		System.out.println(s1+" and "+s2);
	}

}
