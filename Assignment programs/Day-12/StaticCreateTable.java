package com.jdpc.onebill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StaticCreateTable {
	static Connection con = null;
	static Statement stmt = null;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/OneBillBankDB";
			String user = "onebill";
			String pass = "onebill";

			con = DriverManager.getConnection(url, user, pass);
			String query = "create table Employee(empid int primary key, empname varchar(50), empsalary int)";
			stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Table created successfully");
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
