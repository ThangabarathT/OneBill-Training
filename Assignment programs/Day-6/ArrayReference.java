package com.onebill.corejava.array;

import java.util.Arrays;

public class ArrayReference {

	public static void main(String[] args) {
		int[] num1 = {1,2,3,4,5,6,7,8,9,10};
		int[] num2 = {11,12,13,14,15,16,17,18,19,20};
		num2 = num1;
		num2[3] = 99;
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
	}

}
