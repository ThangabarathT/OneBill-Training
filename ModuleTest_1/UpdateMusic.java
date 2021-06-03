package com.onebill.corejava.moduletest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateMusic {
	static String url;
	static String user;
	static String password;
	static Connection con = null;
	static PreparedStatement ps = null;

	public UpdateMusic(String url, String user, String password) {
		UpdateMusic.url = url;
		UpdateMusic.user = user;
		UpdateMusic.password = password;
	}

	public static String updateTitle(int songID, String songTitle) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, user, password);

			String query = "update MusicFiles set Song_Title=? where Song_ID=?;";
			ps = con.prepareStatement(query);

			ps.setString(1, songTitle);
			ps.setInt(2, songID);

			ps.executeUpdate();

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

	public static String updateArtist(int songID, String ArtistName) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, user, password);

			String query = "update MusicFiles set Artist_Name=? where Song_ID=?;";
			ps = con.prepareStatement(query);

			ps.setString(1, ArtistName);
			ps.setInt(2, songID);

			ps.executeUpdate();

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

	public static String updateAlbum(int songID, String album) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, user, password);

			String query = "update MusicFiles set Album_Name=? where Song_ID=?;";
			ps = con.prepareStatement(query);

			ps.setString(1, album);
			ps.setInt(2, songID);

			ps.executeUpdate();

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

	public static String updateLocation(int songID, String location) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, user, password);

			String query = "update MusicFiles set Song_Location=? where Song_ID=?;";
			ps = con.prepareStatement(query);

			ps.setString(1, location);
			ps.setInt(2, songID);

			ps.executeUpdate();

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

	public static String updateDescription(int songID, String description) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, user, password);

			String query = "update MusicFiles set Description=? where Song_ID=?;";
			ps = con.prepareStatement(query);

			ps.setString(1, description);
			ps.setInt(2, songID);

			ps.executeUpdate();

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

	public static String updateAll(int songID, String songTitle, String artistName, String album, String location,
			String description) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, user, password);

			String query = "update MusicFiles set Song_Title=?, Artist_Name=?, Album_Name=?, Song_Location=?, Description=? where Song_ID=?;";
			ps = con.prepareStatement(query);

			ps.setString(1, songTitle);
			ps.setString(2, artistName);
			ps.setString(3, album);
			ps.setString(4, location);
			ps.setString(5, description);
			ps.setInt(6, songID);

			ps.executeUpdate();

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
