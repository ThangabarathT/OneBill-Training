package com.jdpc.onebill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynamicInsert {
	static Connection con = null;
	static PreparedStatement ps = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?user=onebill&password=onebill");

			String query = "insert into Student values(?,?,?)";
			ps = con.prepareStatement(query);

			String s_id = args[0];
			String s_name = args[1];
			String s_mark = args[2];

			int sid = Integer.parseInt(s_id);
			int smark = Integer.parseInt(s_mark);

			ps.setInt(1, sid);
			ps.setString(2, s_name);
			ps.setInt(3, smark);

			ps.executeUpdate();
			System.out.println("Inserted Successfully");
		} catch (Exception e) {
			System.out.println(e);
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
	}

}
