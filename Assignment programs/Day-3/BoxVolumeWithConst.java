/* Constructor Overloading - Find volume of the Box */
package com.onebill.corejava.basic;

import java.util.Scanner;

/**
 * @author T. THANGABARATH
 * @version
 */
class Box {
	double width;
	double length;
	double height;

	/** Default Constructor */
	public Box() {
		width = 1;
		length = 1;
		height = 1;
	}

	/** One Parameter Constructor - Width */
	public Box(double wight) {
		this();
		this.width = wight;
	}

	/** Two Parameter Constructor - Width and Length */
	public Box(double width, double length) {
		this();
		this.width = width;
		this.length = length;
	}

	/** Three Parameter Constructor - Width, Length and Height */
	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}

	/** Volume method with return type */
	public double volume() {
		double volume = width * length * height; // Calculate the Volume of Box
		return volume;
	}
}

public class BoxVolumeWithConst {

	public static void main(String[] args) {
		double width, lenth, height;
		Scanner sc = new Scanner(System.in);
		Box b1 = new Box();
		System.out.print("Enter Width : ");
		width = sc.nextDouble();
		System.out.print("Enter Length : ");
		lenth = sc.nextDouble();
		System.out.print("Enter Height : ");
		height = sc.nextDouble();
		Box b2 = new Box(width);
		Box b3 = new Box(width, lenth);
		Box b4 = new Box(width, lenth, height);
		System.out.println("Volume : " + b1.volume() + " ---> Default Constructor");
		System.out.println("Volume : " + b2.volume() + " ---> W only");
		System.out.println("Volume : " + b3.volume() + " ---> W and L only");
		System.out.println("Volume : " + b4.volume() + " ---> W, L and H");
		sc.close();
	}

}
