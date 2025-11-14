package com.example;

public class Songplayer {
	private String song;
    private int volumeLevel;
 public void setVolume(int volumeLevel) {
     if (volumeLevel < 0 || volumeLevel > 100) {
         System.out.println("Volume must be between 0 and 100.");
     } else {
         this.volumeLevel = volumeLevel;
     }
 }
 public void displayInfo() {
     System.out.println("Now playing: " + song);
     System.out.println("Volume level: " + volumeLevel);
 }
 public void setSong(String song2) {
	this.song=song;
 }
 
 
}


