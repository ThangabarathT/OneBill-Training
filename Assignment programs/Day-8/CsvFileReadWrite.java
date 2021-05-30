package com.onebill.corejava.collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVWriter;

class FileOperation {
	void writeCSV(Scanner sc, String path) {
		try {
			System.out.print("Enter your file name(*.csv) : ");
			String filename = sc.nextLine();
			File file = new File(path + filename);
			if (file.createNewFile()) {
				System.out.println(file.getName() + " File created successfully");
				System.out.print("If you want write this file(y/n) ? : ");
				char ch = sc.next().charAt(0);
				if ((ch == 'y') || (ch == 'Y')) {
					int count = 1;
					char check = ' ';
					FileWriter writer = new FileWriter(file, true);
					CSVWriter write = new CSVWriter(writer);
					System.out.println("Enter the No of column : ");
					int col = sc.nextInt();
					String[] rowdata = new String[col];
					do {

						System.out.println("Enter the No of rows : ");
						int row = sc.nextInt();
						sc.nextLine();
						for (int i = 0; i < row; i++) {
							List<String[]> data = new ArrayList<String[]>();
							System.out.println("Enter row " + (count) + " data");
							for (int j = 0; j < col; j++) {
								rowdata[j] = sc.nextLine();
							}
							data.add(rowdata);
							write.writeAll(data);
							count++;
						}

						System.out.println("File wrote successfully");
						System.out.print("If you want add another row(y/n) ? : ");
						check = sc.next().charAt(0);
					} while ((check == 'y') || (check == 'Y'));
					write.close();
				} else {
					System.out.println("------Exit------");
				}
			} else {
				System.out.println("File already exists.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("IOException occurred!!");
		}
		CsvFileReadWrite.operation();
	}

	void readCSV(Scanner sc, String path) {
		System.out.print("Enter file name(*.csv) : ");
		String filename = sc.nextLine();
		try {
			Scanner read = new Scanner(new File(path + filename));
			while (read.hasNext()) {
				System.out.println(read.next());
			}
			read.close();
			System.out.println();
		} catch (FileNotFoundException e) {
			System.out.println(filename + " File not found");
		}
		CsvFileReadWrite.operation();
	}

	void properties(Scanner sc, String path) {
		System.out.print("Enter file name(*.csv) : ");
		String filename = sc.nextLine();
		File file = new File(path + filename);
		if (file.exists()) {
			System.out.println("File name : " + file.getName());
			System.out.println("File path : " + file.getAbsolutePath());
			System.out.println("Write     : " + file.canWrite());
			System.out.println("Read      : " + file.canRead());
			System.out.println("File size : " + file.length() + "bytes");
			long last = file.lastModified();
			Date date = new Date(last);
			System.out.println("File last modified : " + date);
		} else {
			System.out.println("The file does not exist.");
		}
		CsvFileReadWrite.operation();
	}
}

public class CsvFileReadWrite {
	static String filePath = "/home/barath/Thangam/Java/";

	public static void main(String[] args) {
		operation();

	}

	static void operation() {
		FileOperation ope = new FileOperation();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n--------Main Menu--------");
		System.out.println("1. Write CSV file\n2. Read CSV file\n3. Properties of CSV file\n4. Exit");
		System.out.print("\nSelect any option : ");
		int key = Integer.parseInt(sc.nextLine());
		switch (key) {
		case 1:
			ope.writeCSV(sc, filePath);
			break;
		case 2:
			ope.readCSV(sc, filePath);
			break;
		case 3:
			ope.properties(sc, filePath);
			break;
		case 4:
			System.out.println("-----------Exit from Main Menu----------");
			System.exit(0);
			break;
		default:
			System.out.println("You select wrong option. Please try again");
			break;
		}
	}
}
