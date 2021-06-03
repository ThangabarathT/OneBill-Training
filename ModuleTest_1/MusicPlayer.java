package com.onebill.corejava.moduletest1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		int key;
		char option;
		Random rand = new Random();
		SelectMusic selectSong = new SelectMusic();
		ArrayList<MusicFiles> songs = selectSong.select();
		Scanner sc = new Scanner(System.in);
		// Music Player Main Menu Options
		System.out.println("---------------Main Menu---------------");
		System.out.println("Press 1 to “Play a Song”");
		System.out.println("Press 2 to “Search a Song”");
		System.out.println("Press 3 to “Show all Songs”");
		System.out.println("Press 4 to “Operate on Songs Database”");

		System.out.print("\nSelect any one : ");
		key = sc.nextInt(); // Get options from user

		// Switch Case for choose options
		switch (key) {
		// Play a song
		case 1:

			System.out.println("\n---------------Play a Song---------------");
			System.out.println("Press A to “Play all songs”");
			System.out.println("Press B to “Play Songs Randomly”");
			System.out.println("Press C to “Play a Particular Song”");
			System.out.print("\nSelect any one : ");
			option = sc.next().charAt(0);
			char next = ' ';

			switch (option) {

			case 'a':
			case 'A':
				for (MusicFiles m : songs) {
					System.out.println("Song Title : " + m.songTitle);
					System.out.println("Artist Name : " + m.artistName);
					System.out.println("Album Name : " + m.albumName);
					try {
						Thread.sleep(1000);
						System.out.println("Playing the Song - " + m.songTitle + "...");
						Thread.sleep(20000);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
				break;

			case 'b':
			case 'B':
				int index = rand.nextInt(songs.size());
				System.out.println("Song Title : " + songs.get(index).songTitle);
				System.out.println("Artist Name : " + songs.get(index).artistName);
				System.out.println("Album Name : " + songs.get(index).albumName);
				try {
					Thread.sleep(1000);
					System.out.println("Playing the Song - " + songs.get(index).songTitle + "...");
					Thread.sleep(1000);
					System.out.println("\n" + songs.get(index).songTitle + " end");
				} catch (Exception e) {
					System.out.println(e);
				}
				break;

			case 'c':
			case 'C':
				sc.nextLine();
				System.out.println("Enter a Song Title : ");
				String title = sc.nextLine();

				for (MusicFiles m : songs) {
					if ((m.songTitle).equals(title)) {
						System.out.println("Song Title : " + m.songTitle);
						System.out.println("Artist Name : " + m.artistName);
						System.out.println("Album Name : " + m.albumName);
						try {
							Thread.sleep(1000);
							System.out.println("Playing the Song - " + m.songTitle + "...");
							Thread.sleep(1000);
						} catch (Exception e) {
							System.out.println(e);
						}
					}
				}
				// System.out.println("“"+title+"” song not found in database");
				break;

			default:
				System.out.println("You press wrong option. Please try again");
				break;
			}
			break;

		// Search a Song
		case 2:
			do {
				System.out.println("\n---------------Search a Song---------------");
				String exist = null;

				sc.nextLine();
				System.out.println("Search by Song Title : ");
				String title = sc.nextLine();
				for (MusicFiles m : songs) {
					if ((m.songTitle).contains(title)) {
						exist = "available";
					}
				}
				if (exist != null) {
					char ch = ' ';
					do {
						System.out.printf("%-40s %-40s %-10s", "File Name", "Attributes", "Play ID");
						for (MusicFiles m : songs) {
							if ((m.songTitle).contains(title)) {
								System.out.println();
								System.out.printf("\n%-40s %-40s %-10d", m.songTitle + ".mp3",
										"Title  : " + m.songTitle, (songs.indexOf(m)+1));
								System.out.printf("\n%40s %-55s", "", "Artist : " + m.artistName);
								System.out.printf("\n%40s %-55s", "", "Album : " + m.albumName);
							}
						}
						System.out.print("\nSelect Play ID to play song : ");
						int index = sc.nextInt()+1;
						
						System.out.println("Song Title : " + songs.get(index).songTitle);
						System.out.println("Artist Name : " + songs.get(index).artistName);
						System.out.println("Album Name : " + songs.get(index).albumName);
						try {
							Thread.sleep(1000);
							System.out.println("Playing the Song - " + songs.get(index).songTitle + "...");
							Thread.sleep(1000);
							System.out.println("\n" + songs.get(index).songTitle + " end");
						} catch (Exception e) {
							System.out.println(e);
						}
						System.out.println("If you want continue(y/n) : ");
						ch = sc.next().charAt(0);
					} while ((ch == 'y') || (ch == 'Y'));
				} else {
					System.out.println("“" + title + "” song not found in database");
				}

				System.out.print("\nIf you want search again(y/n) : ");
				next = sc.next().charAt(0);

			} while ((next == 'y') || next == 'Y');
			break;

		// Show all Songs
		case 3:
			System.out.println("\n---------------Show all Songs---------------");
			System.out.printf("%-40s %-40s %-10s %-10s", "File Name", "Attributes", "Song ID", "Play ID");
			for (MusicFiles m : songs) {
					System.out.println();
					System.out.printf("\n%-40s %-40s %-10d %-10d", m.songTitle + ".mp3",
							"Title  : " + m.songTitle,m.songID, (songs.indexOf(m)+1));
					System.out.printf("\n%40s %-55s", "", "Artist : " + m.artistName);
					System.out.printf("\n%40s %-55s", "", "Album : " + m.albumName);
				
			}
			break;

		// Operate on Songs Database
		case 4:
			System.out.println("\n----------Operate on Songs Database-----------");
			System.out.println("Press A to “Add Song”");
			System.out.println("Press B to “Edit an existing Song”");
			System.out.println("Press C to “Delete an existing Song”");
			System.out.print("\nSelect any one : ");
			option = sc.next().charAt(0);
			int songID;
			String songTitle;
			String artistName;
			String albumName;
			String songLocation;
			String description;
			String exist;
			switch (option) {
			case 'a':
			case 'A':
				sc.nextLine();
				System.out.print("Enter Song Title : ");
				songTitle = sc.nextLine();
				
				System.out.print("Enter Artist Name : ");
				artistName = sc.nextLine();
				
				System.out.print("Enter Album Name : ");
				albumName = sc.nextLine();
				
				System.out.print("Enter Song Location : ");
				songLocation = sc.nextLine();
				
				System.out.print("Enter Description : ");
				description = sc.nextLine();
				
				String insert = InsertMusic.insert(songTitle, artistName, albumName, songLocation, description);
				System.out.println("\n"+insert);
				break;
				
			case 'b':
			case 'B':
				String newSongTitle;
				String newArtistName;
				String newAlbumName;
				String newSongLocation;
				String newDescription;
				exist = null;
				sc.nextLine();
				System.out.println("Which song you want to edit ?");
				System.out.print("Enter Song ID : ");
				songID = sc.nextInt();
				for (MusicFiles m : songs) {
					if (m.songID == songID) {
						exist = "available";
					}
				}
				if(exist != null) {
					System.out.println("Press 1 to edit “Song Title” only");
					System.out.println("Press 2 to edit “Artist Name” only");
					System.out.println("Press 3 to edit “Album Name” only");
					System.out.println("Press 4 to edit “Song Location” only");
					System.out.println("Press 5 to edit “Description” only");
					System.out.println("Press 6 to edit “All info”");
					System.out.print("\nSelect any one : ");
					int up = sc.nextInt();
					
					switch (up) {
					
					case 1:
						System.out.print("\nEnter New Song Title : ");
						newSongTitle = sc.nextLine();
						String newTitle = UpdateSongTitle.updateTitle(songID, newSongTitle);
						System.out.println(newTitle);
						break;

					default:
						break;
					}
				}else {
					System.out.println("“Song ID = " + songID + "” not found in database");
				}
				
				break;
				
			case 'c':
			case 'C':
				exist = null;
				sc.nextLine();
				System.out.println("Which song you want to delete ?");
				System.out.print("Enter Song ID : ");
				songID = sc.nextInt();
				for (MusicFiles m : songs) {
					if (m.songID == songID) {
						exist = "available";
					}
				}
				if(exist != null) {
					String delete = DeleteMusic.delete(songID);
					System.out.println("\n"+delete);
				}else {
					System.out.println("“Song ID = " + songID + "” not found in database");
				}
				break;
				
				
			default:
				System.out.println("You Press wrong option. Please try again");
				break;
			}
			break;

		default:
			System.out.println("You press wrong key. Please try again");
		}
		sc.close();
	}

}
