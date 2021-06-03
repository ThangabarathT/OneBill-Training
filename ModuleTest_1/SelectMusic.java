package com.onebill.corejava.moduletest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectMusic {

	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs = null;

	static ArrayList<MusicFiles> song = new ArrayList<MusicFiles>();

	public ArrayList<MusicFiles> select() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/MusicPlayer";
			String user = "onebill";
			String password = "onebill";

			con = DriverManager.getConnection(url, user, password);

			String query = "select * from MusicFiles order by Song_Title ASC;";
			stmt = con.createStatement();

			rs = stmt.executeQuery(query);
			while (rs.next()) {
				int songID = rs.getInt("Song_ID");
				String songTitle = rs.getString("Song_Title");
				String artistName = rs.getString("Artist_Name");
				String albumName = rs.getString("Album_Name");
				String songLocation = rs.getString("Song_Location");
				String description = rs.getString("Description");

				song.add(new MusicFiles(songID, songTitle, artistName, albumName, songLocation, description));
			}

		} catch (Exception e) {
			System.out.println(e);
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
		return song;
	}

}
