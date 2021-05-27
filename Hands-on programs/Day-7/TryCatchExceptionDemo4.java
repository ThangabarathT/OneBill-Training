package com.onebill.corejava.exceptionhandling;

public class TryCatchExceptionDemo4 {

	public static void main(String[] args) {
		int[] div = {2,4,16,32,64,128,256,512};
		int[] dino = {2,0,4,4,0,8};
		for (int i=0;i<div.length;i++) {
			try {
				System.out.println(div[i]+"/"+dino[i]+"="+div[i]/dino[i]);
			}catch (ArithmeticException e) {
				System.out.println("Can't to be divided by zero");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Dinominator not fount");
			}catch (Exception e) {
				System.out.println("General Exception");
			}
			
		}
	}

}
