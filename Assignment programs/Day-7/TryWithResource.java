/* Example program for Try with resources */
package com.onebill.corejava.exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResource {
	public static void main(String args[]) {
		// Using Try with resources
		try (FileInputStream input = new FileInputStream("file.txt")) {

			int data = input.read();
			while (data != -1) {
				System.out.print((char) data);
				data = input.read();
			}
		}catch(IOException e) {
			System.out.println("File Not Found");
		}

	}
}
