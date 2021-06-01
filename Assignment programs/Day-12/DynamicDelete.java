package com.jdpc.onebill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DynamicDelete {
	static Connection con = null;
	static PreparedStatement ps = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillStudent", "onebill", "onebill");

			String query = "delete from Student where sid=?";
			ps = con.prepareStatement(query);
			System.out.print("Enter which student id you want delete : ");
			int sid = sc.nextInt();

			ps.setInt(1, sid);
			ps.executeUpdate();
			System.out.println("Student id " + sid + " delete successfully");
		} catch (Exception e) {
			System.out.println("Exception occurs");
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}

			} catch (Exception e) {
				System.out.println("Exception Occurs");
			}
		}
		sc.close();
	}

}
