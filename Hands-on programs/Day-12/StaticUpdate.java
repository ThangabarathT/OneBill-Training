package com.jdpc.onebill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StaticUpdate {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String db_url = "jdbc:mysql://localhost:3306/OneBillStudent?user=onebill&password=onebill";

			con = DriverManager.getConnection(db_url);

			String query = "update Student set marks=80 where sid=2";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			System.out.println("No of records : " + count);
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
