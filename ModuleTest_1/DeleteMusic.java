package com.onebill.corejava.moduletest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteMusic {
	static String url;
	static String user;
	static String password;
	static Connection con = null;
	static PreparedStatement ps = null;

	public DeleteMusic(String url, String user, String password) {
		DeleteMusic.url = url;
		DeleteMusic.user = user;
		DeleteMusic.password = password;
	}

	public static String delete(int songID) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, user, password);

			String query = "delete from MusicFiles where Song_ID  = ?;";
			ps = con.prepareStatement(query);

			ps.setInt(1, songID);

			ps.executeUpdate();

			return "Deleted Successfully";
		} catch (Exception e) {
			return e.toString();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}

			} catch (Exception e) {
				return e.toString();
			}
		}

	}

}
