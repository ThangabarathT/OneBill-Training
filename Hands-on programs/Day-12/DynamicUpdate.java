package com.jdpc.onebill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynamicUpdate {

	static Connection con = null;
	static PreparedStatement ps = null;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?user=onebill&password=onebill");

			String query = "update Student set sname=?,marks=? where sid=3";
			ps = con.prepareStatement(query);
			String name = args[0];
			int mark = Integer.parseInt(args[1]);
			ps.setString(1, name);
			ps.setInt(2, mark);

			boolean flag = ps.execute();
			System.out.println(flag);

		} catch (Exception e) {
			System.out.println("Exception");
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
