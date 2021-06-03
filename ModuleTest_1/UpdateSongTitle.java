package com.onebill.corejava.moduletest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class UpdateSongTitle {

	static Connection con = null;
	static PreparedStatement ps = null;

	public static String updateTitle(int songID, String songTitle) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=onebill&password=onebill");

			String query = "update MusicFiles set Song_Title=? where Song_ID="+songID;
		
			ps = con.prepareStatement(query);
			
			
			ps.setString(1, songTitle);
		
			return "Updated Successfully";

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
