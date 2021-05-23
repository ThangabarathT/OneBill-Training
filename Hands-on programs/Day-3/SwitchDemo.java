/* Example program for Switch Statement */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */
public class SwitchDemo {

	public static void main(String[] args) {
		for (int i = 0; i <= 7; i++) {
			switch (i) {
			case 0:
				System.out.println("i is less than 1");
				break;
			case 1:
				System.out.println("i is less than 2");
				break;
			case 2:
				System.out.println("i is less than 3");
				break;
			case 3:
				System.out.println("i is less than 4");
				break;
			case 4:
				System.out.println("i is less than 5");
				break;
			default:
				System.out.println("This is default");
			}
			System.out.println();
		}
	}

}
