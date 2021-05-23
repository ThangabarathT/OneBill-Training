/* Example for CLA - Command Line Arguments
 * Command Line Argument is user can enter the value during execution of the program
 */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
public class CLADemo {
	public static void main(String[] args) {
		System.out.println("Arg 1 : " + args[0]);
		System.out.println("Arg 2 : " + args[1]);
		System.out.println("Arg 3 : " + args[2]);
		System.out.println("Arg 4 : " + (args[3]));
		System.out.println("Arg 5 : " + (Integer.valueOf(args[4]) + 10));
	}
}
