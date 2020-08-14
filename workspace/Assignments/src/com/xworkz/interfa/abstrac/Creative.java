package com.xworkz.interfa.abstrac;

public abstract class Creative implements Speaker {

	abstract void volumeHigh();

	abstract void volumeLow();

	@Override
	public void turnOn() {
		System.out.println("Turn On Speakers");
	}
}
