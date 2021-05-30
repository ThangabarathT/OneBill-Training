package com.onebill.corejava.collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {

	public static void main(String[] args) {
		String filename = "/home/barath/Thangam/Java/Test.txt";
		File file = new File(filename);
		Scanner sc = new Scanner(System.in);
		System.out.println("Main menu");
		System.out.println("1. Write file\n2. Read file\n3. Properties of file");
		System.out.println("Select option");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			try {
				FileWriter Writer = new FileWriter(filename);
			      Writer.write("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
			      Writer.close();
			      System.out.println("Successfully wrote to the file.");
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				Scanner Reader = new Scanner(file);
				while (Reader.hasNextLine()) {
					String data = Reader.nextLine();
					System.out.println(data);
				}
				Reader.close();
			} catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
			break;
		case 3:
			if (file.exists()) {
				System.out.println("File name : " + file.getName());
				System.out.println("File path : " + file.getAbsolutePath());
				System.out.println("Write     : " + file.canWrite());
				System.out.println("Read      : " + file.canRead());
				System.out.println("File size : " + file.length());
			} else {
				System.out.println("The file does not exist.");
			}
			break;
		}
		sc.close();
	}

}
