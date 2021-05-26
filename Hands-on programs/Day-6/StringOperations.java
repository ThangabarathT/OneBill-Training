/* Example program for String Operations */
package com.onebill.corejava.basics;

public class StringOperations {

	public static void main(String[] args) {
		String s1 = "Javaisfuntolearn";
		String s2 = "Enjoytolearn";
		
		/* Find length of the string */
		System.out.println(s1.length());
		
		/* Concat two strings */
		System.out.println(s1.concat(s2));
		
		/* Find index of the String */
		System.out.println(s1.indexOf("learn"));
		
		/* Find character using index value */
		System.out.println(s1.charAt(6));
		
		/* Find Sub String of the string using index value */
		System.out.println(s2.substring(7));

		String s3 = "   Enjoy   ";
		/* Trim the space of the String */
		System.out.println(s3.trim());

		String s4 = "Java";
		String s5 = "JavaProgramming";
		
		/* Compare to two Strings */
		System.out.println(s4.compareTo(s5));
	}

}
