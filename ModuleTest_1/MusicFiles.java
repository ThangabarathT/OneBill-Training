package com.onebill.corejava.moduletest1;

public class MusicFiles {
	
	int songID;
	String songTitle;
	String artistName;
	String albumName;
	String songLocation;
	String description;
	public MusicFiles(int songID, String songTitle, String artistName, String albumName, String songLocation,
			String description) {
		super();
		this.songID = songID;
		this.songTitle = songTitle;
		this.artistName = artistName;
		this.albumName = albumName;
		this.songLocation = songLocation;
		this.description = description;
	}
	public int getSongID() {
		return songID;
	}
	public void setSongID(int songID) {
		this.songID = songID;
	}
	public String getSongTitle() {
		return songTitle;
	}
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getSongLocation() {
		return songLocation;
	}
	public void setSongLocation(String songLocation) {
		this.songLocation = songLocation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "MusicFiles [songID=" + songID + ", songTitle=" + songTitle + ", artistName=" + artistName
				+ ", albumName=" + albumName + ", songLocation=" + songLocation + ", description=" + description + "]";
	}

}
