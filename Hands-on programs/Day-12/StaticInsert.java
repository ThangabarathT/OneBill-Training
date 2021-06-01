package com.jdpc.onebill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StaticInsert {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String db_url = "jdbc:mysql://localhost:3306/OneBillStudent?user=onebill&password=onebill";

			con = DriverManager.getConnection(db_url);

			String query = "insert into Student values(2,'Tony',95)";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			System.out.println("No of inserted records : " + count);
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				System.out.println("Exception");
			}
		}
	}

}
