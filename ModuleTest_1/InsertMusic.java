package com.onebill.corejava.moduletest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertMusic {
	static String url;
	static String user;
	static String password;
	static Connection con = null;
	static PreparedStatement ps = null;

	public InsertMusic(String url, String user, String password) {
		InsertMusic.url = url;
		InsertMusic.user = user;
		InsertMusic.password = password;
	}

	public static String insert(String songTitle, String artistName, String albumName, String songLocation,
			String description) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, user, password);

			String query = "insert into MusicFiles(Song_Title, Artist_Name,Album_Name,Song_Location,Description) values(?,?,?,?,?);";
			ps = con.prepareStatement(query);

			ps.setString(1, songTitle);
			ps.setString(2, artistName);
			ps.setString(3, albumName);
			ps.setString(4, songLocation);
			ps.setString(5, description);

			ps.executeUpdate();

			return "Inserted Successfully";
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
