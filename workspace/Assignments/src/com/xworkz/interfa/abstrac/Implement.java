package com.xworkz.interfa.abstrac;

public class Implement extends Creative {
	public void playMusic() {
		System.out.println("Playing songs");
	}

	public void connectToSystem() {
		System.out.println("Connecting to system");
	}

	void volumeHigh() {
		System.out.println("Turn to high volume");
	}

	void volumeLow() {
		System.out.println("Low volume");
	}

}
