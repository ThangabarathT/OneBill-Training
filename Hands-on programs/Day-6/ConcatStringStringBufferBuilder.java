package com.onebill.corejava.basics;

public class ConcatStringStringBufferBuilder {
	public static void concat1(String s1) {
		s1 = s1 + (" for freshers");
	}

	public static void concat2(StringBuffer s2) {
		s2.append(" for freshers");
	}

	public static void concat3(StringBuilder s3) {
		s3.append(" for freshers");
	}

	public static void main(String[] args) {
		String str = "TechnoElevate";
		concat1(str);
		System.out.println(str);

		StringBuffer strbf = new StringBuffer("OneBill");
		concat2(strbf);
		System.out.println(strbf);

		StringBuilder strbl = new StringBuilder("OneBill");
		concat3(strbl);
		System.out.println(strbl);

	}
}
