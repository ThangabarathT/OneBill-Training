package com.jdpc.onebill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class GetConnection {

	static Connection con = null;

	public static void main(String[] args) {

		/* Connection established using getConnection(String url, Properties into) */
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Properties info = new Properties();
			info.put("user", "onebill");
			info.put("password", "onebill");
			String url = "jdbc:mysql://localhost:3306/OneBillBankDB";

			con = DriverManager.getConnection(url, info);
			System.out.println("Connection established by getConnection(String url, Properties into)");
		} catch (Exception e) {
			System.out.println(e);
		}

		/*
		 * Connection established using getConnection(String url, String user, String
		 * password)
		 */

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/OneBillBankDB";
			String user = "onebill";
			String password = "onebill";

			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection established by getConnection(String url, String user, String password)");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
