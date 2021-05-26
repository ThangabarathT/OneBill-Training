package com.onebill.corejava.basics;

public class StringConvert {
	public static void main(String[] args) {
		String str = "OneBill";

		/** Convert String to String Buffer */
		StringBuffer s1 = new StringBuffer(str);
		s1.reverse();
		System.out.println(s1);

		/** Convert String to String Builder */
		StringBuilder s2 = new StringBuilder(str);
		s2.append(" for future");
		System.out.println(s2);

		/** Convert String Buffer to String */
		StringBuffer sb = new StringBuffer("String Buffer");
		String sb_string = sb.toString();
		System.out.println(sb_string);

		/** Convert String Builder to String */
		StringBuilder sbb = new StringBuilder("String Builder");
		String sbb_string = sbb.toString();
		System.out.println(sbb_string);

	}

}
