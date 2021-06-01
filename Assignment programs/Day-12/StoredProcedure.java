package com.jdpc.onebill;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class StoredProcedure {
	static Connection con = null;
	static CallableStatement cs = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/OneBillStudent";
			String user = "onebill";
			String password = "onebill";

			con = DriverManager.getConnection(url, user, password);
			String query = "call deleterecord(?)";
			cs = con.prepareCall(query);
			System.out.print("Enter which student id you want delete : ");
			int sid = sc.nextInt();

			cs.setInt(1, sid);
			boolean flag = cs.execute();
			System.out.println(flag);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (cs != null) {
					cs.close();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		sc.close();
	}

}
