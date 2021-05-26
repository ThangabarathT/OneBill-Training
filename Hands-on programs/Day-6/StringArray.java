/* Example program for String array */
package com.onebill.corejava.basics;

public class StringArray {

	public static void main(String[] args) {
		String[] sample = { "This", "is", "a", "test" };
		for (String s : sample) {
			System.out.print(s + " ");
		}
		System.out.println();
		sample[1] = "was";
		sample[3] = sample[3].concat(", too!");
		for (String s : sample) {
			System.out.print(s + " ");
		}
	}

}
