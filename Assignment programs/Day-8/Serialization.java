/* Example program for Serialization
 * 
 *  Serialization is a mechanism of converting the 
 *  state of an object into a byte stream.
 *  
 *  The byte stream created is platform independent. 
 *  So, the object serialized on one platform can be 
 *  deserialized on a different platform.
 *  
 */
package com.onebill.corejava.multithread;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	long AccNo;
	String AccName;

	public Account(long no, String name) {
		this.AccNo = no;
		this.AccName = name;
	}
}

public class Serialization {

	public static void main(String[] args) {
		try {
			/* Create object for SSerializable implemented class */
			Account acc = new Account(98765432, "Steve Rogers");
			
			/* Creating stream and writing the object */  
			FileOutputStream fout=new FileOutputStream("/home/barath/Videos/Account.txt");  
			ObjectOutputStream ser=new ObjectOutputStream(fout);  
			ser.writeObject(acc);
			ser.flush();
			ser.close();  // Close the stream
			
			System.out.println("Success!!!");
		}catch(IOException e) {
			System.out.println("IO Exception occur");
		}
	}

}
