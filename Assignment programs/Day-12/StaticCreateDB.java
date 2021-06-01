package com.jdpc.onebill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StaticCreateDB {
	static Connection con = null;
	static Statement stmt = null;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/";
			String user = "onebill";
			String pass = "onebill";

			con = DriverManager.getConnection(url, user, pass);

			String query = "create database OneBillBankDB";
			stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Database created successfully");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
