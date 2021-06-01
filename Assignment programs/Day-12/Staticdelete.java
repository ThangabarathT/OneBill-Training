package com.jdpc.onebill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class Staticdelete {
	static Connection con = null;
	static Statement stmt = null;

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Properties info = new Properties();
			info.put("user", "onebill");
			info.put("password", "onebill");
			String url = "jdbc:mysql://localhost:3306/OneBillStudent";

			con = DriverManager.getConnection(url, info);

			String query = "delete from Student where sid=2";

			stmt = con.createStatement();

			int count = stmt.executeUpdate(query);

			System.out.println("No of deleted records : " + count);
		} catch (Exception e) {
			System.out.println("Check the code for errors!");
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}

			} catch (Exception e) {
				System.out.println("Exception occurs");
			}
		}
	}

}
