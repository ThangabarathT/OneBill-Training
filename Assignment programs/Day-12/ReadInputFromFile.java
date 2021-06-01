package com.jdpc.onebill;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class ReadInputFromFile {
	static Connection con = null;
	static PreparedStatement ps = null;

	public static void main(String[] args) {
		String filename = "Data.txt";
		File file = new File(filename);

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Properties info = new Properties();
			info.put("user", "onebill");
			info.put("password", "onebill");
			String url = "jdbc:mysql://localhost:3306/OneBillBankDB";

			con = DriverManager.getConnection(url, info);
			String query = "insert into Employee values(?,?,?)";
			ps = con.prepareStatement(query);

			Scanner Reader = new Scanner(file);
			while (Reader.hasNext()) {
				String data = Reader.nextLine();
				String[] split = data.split(",");
				String id = split[0];
				String name = split[1];
				String salary = split[2];
				int empid = Integer.parseInt(id);
				int empsalary = Integer.parseInt(salary);
				ps.setInt(1, empid);
				ps.setString(2, name);
				ps.setInt(3, empsalary);
				ps.executeUpdate();
			}
			System.out.println("Inserted Successfully");
			Reader.close();
		} catch (Exception e) {
			System.out.println("Exception Occurs");
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
