package com.onebill.corejava.multithread;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		try {
			/*Creating stream to read the object*/
			FileInputStream input = new FileInputStream("/home/barath/Videos/Account.txt");
			ObjectInputStream des = new ObjectInputStream(input);
			Account accde = (Account)des.readObject();
			/*printing the data of the serialized object*/
			System.out.println("Account No :" +accde.AccNo+"\nAccountant Name :"+accde.AccName);
			des.close();
		}catch(Exception e) {
			System.out.println("Exception Occurs");
		}
	}

}
