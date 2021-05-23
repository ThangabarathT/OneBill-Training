/* Print truth table */
package com.onebill.corejava.basic;

/**
 * @author T. THANGABARATH
 * @version
 */

public class TruthTable {

	public static void main(String[] args) {
		System.out.println("---------------------------------------" 
							+ "------------------------------------------");
		System.out.println("|\tP\t|\tQ\t|\tP&Q\t|\tP|Q\t|\tP^Q\t|");
		System.out.println("---------------------------------------" 
							+ "------------------------------------------");
		System.out.println("|\tT\t|\tT\t|\tT\t|\tT\t|\tF\t|");
		System.out.println("|\tT\t|\tF\t|\tF\t|\tT\t|\tT\t|");
		System.out.println("|\tF\t|\tT\t|\tF\t|\tT\t|\tT\t|");
		System.out.println("|\tF\t|\tF\t|\tF\t|\tF\t|\tF\t|");
		System.out.println("---------------------------------------" 
							+ "------------------------------------------");
		System.out.println();

		boolean[] bool = { true, false };
		boolean p, q;
		System.out.println("---------------------------------------" 
				+ "------------------------------------------");
		System.out.println("|\tP\t|\tQ\t|\tP&Q\t|\tP|Q\t|\tP^Q\t|");
		System.out.println("---------------------------------------" 
				+ "------------------------------------------");
		for (int i = 0; i < 2; i++) {
			p = bool[i];
			for (int j = 0; j < 2; j++) {
				q = bool[j];
				System.out.println("|\t" + p + "\t|\t" + q + "\t|\t" + (p & q)
									+ "\t|\t" + (p | q) + "\t|\t" + (p ^ q) + "\t|");
			}
		}
		System.out.println("---------------------------------------" 
				+ "------------------------------------------");
	}

}
