package com.jdpc.onebill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DynamicSelect {
	static Connection con = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?user=onebill&password=onebill");

			String query = "select * from Student where sid=?";
			pstmt = con.prepareStatement(query);

			String id = args[0];
			int s_id = Integer.parseInt(id);
			pstmt.setInt(1, s_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int student_id = rs.getInt("sid");
				String student_name = rs.getString("sname");
				int student_mark = rs.getInt("marks");

				System.out.println("Student ID   : " + student_id);
				System.out.println("Student Name : " + student_name);
				System.out.println("Student Mark : " + student_mark);
				
			} else {
				System.out.println("Record not found");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				System.out.println("Exception occurs");
			}
		}

	}

}
