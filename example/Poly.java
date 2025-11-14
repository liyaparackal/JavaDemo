package com.example;
class Instrument {
    void play() {
        System.out.println("Playing a song");
    }

    void play(String song) {
        System.out.println("Playing the song " + song );
    }

    void play(int volume) {
        System.out.println("Playing at volume level " + volume);
    }
}

public class Poly {
	public static void main(String[] args) {
        Instrument i = new Instrument();
        i.play();                  // No arguments
        i.play("Rasputin"); // String argument
        i.play(7);                 // Integer argument
    }

}
