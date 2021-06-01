package com.jdpc.onebill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StaticSelect {
	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String db_url = "jdbc:mysql://localhost:3306/OneBillStudent?user=onebill&password=onebill";
			con = DriverManager.getConnection(db_url);
			String query = "select * from Student";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				int student_id = rs.getInt("sid");
				String student_name = rs.getString("sname");
				int student_mark = rs.getInt("marks");

				System.out.println("Student ID   : " + student_id);
				System.out.println("Student Name : " + student_name);
				System.out.println("Student Mark : " + student_mark);
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Check the code for errors!");
		} finally {
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				System.out.println("Exception occurs");
			}
		}
	}
}
