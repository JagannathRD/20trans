package com.xworkz.interfa.abstrac;

public class Tester {
	public static void main(String[] args) {

		System.out.println("MMS");
		Speaker speaker = new Implement();
		speaker.playMusic();
		speaker.turnOn();

		Creative creative = new Implement();
		creative.connectToSystem();
		creative.playMusic();
		creative.turnOn();
		creative.volumeHigh();
		creative.volumeLow();

		System.out.println("MME");

	}
}
