/* Example program for Nested Switch Statement */
package com.onebill.corejava.basic;

import java.util.Scanner;

/**
 * @author T. THANGABARATH
 * @version
 */
public class NestedSwitch {

	public static void main(String[] args) {
		int key = 0, key1 = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Key values for Control Statements");
			System.out.println("1-Selection\n2-Iteration\n3-Jump\n");
			System.out.print("Please Enter key : ");
			key = sc.nextInt();
			switch (key) {
			case 1:
				do {
					System.out.println("Key values for Selection Statements");
					System.out.println("1-if Statement\n2-if else Statement");
					System.out.println("3-nested if Statement\n4-switch Statement\n");
					System.out.print("Please Enter key : ");
					key1 = sc.nextInt();
					switch (key1) {
					case 1:
						System.out.println("if (condition) {\n\tStatements\n\t...\n}");
						break;
					case 2:
						System.out.println("if (condition) {\n\tStatements\n\t...");
						System.out.println("} else {\n\tStatements\n\t...\n}");
						break;
					case 3:
						System.out.println("if (condition1) {\n\tStatements\n\t...");
						System.out.println("\tif (condition2) {\n\t\tStatements\n\t\t...\n\t}\n}");
						break;
					case 4:
						System.out.println("switch (expression) {\n\tcase value1:");
						System.out.println("\t\tStatements\n\t\t...\n\t\tbreak;");
						System.out.println("\tcase value2:\n\t\tStatements\n\t\t...");
						System.out.println("\t\tbreak;\n\t\t.\n\t\t.\n\t\t.");
						System.out.println("\t// You can have any number of case statements.");
						System.out.println("\tdefault:\n\t\tStatements\n\t\t...\n}");
						break;
					default:
						System.out.println("Please Enter valid key\n");
						break;
					}
				} while (key1 > 4);
				break;

			case 2:
				do {
					System.out.println("Key values for Iteration Statements");
					System.out.println("1-for loop\n2-while loop\n3-do while loop\n");
					System.out.print("Please Enter key : ");
					key1 = sc.nextInt();
					switch (key1) {
					case 1:
						System.out.println("for (initialization;condition;incr/decr) {\n\tStatements\n\t...\n}");
						break;
					case 2:
						System.out.println("while (condition) {\n\tStatements\n\t...\n}");
						break;
					case 3:
						System.out.println("do {\n\tStatements\n\t...\n} while (condition);");
						break;
					default:
						System.out.println("Please Enter valid key\n");
						break;
					}
				} while (key1 > 3);
				break;

			case 3:
				do {
					System.out.println("Key values for Jump Statements");
					System.out.println("1-break\n2-continue\n3-return\n");
					System.out.print("Please Enter key : ");
					key1 = sc.nextInt();
					switch (key1) {
					case 1:
						System.out.println("jump-statement;\nbreak;");
						break;
					case 2:
						System.out.println("jump-statement;\ncontinue;");
						break;
					case 3:
						System.out.println("return (value); // void methods cannot return a value");
						break;
					default:
						System.out.println("Please Enter valid key\n");
						break;
					}
				} while (key1 > 3);
				break;

			default:
				System.out.println("Please Enter valid key");
				break;
			}
		} while (key > 3);
		sc.close();
	}

}
