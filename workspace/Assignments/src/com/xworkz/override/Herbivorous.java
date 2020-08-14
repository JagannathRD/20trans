package com.xworkz.override;

public class Herbivorous extends Animal {
	public Herbivorous(int age, String livingPlace) {
		super(age, livingPlace);
		
	}

	@Override
	void eats() {
		System.out.println("Herbivorous eats");
	}

	@Override
	void drinks() {
		System.out.println("Herbivorous drinks");
	}

	@Override
	void sleeps() {
		System.out.println("herbivorous sleeps");
	}
	@Override
	void getAnimalDetails(){
		System.out.println("Age "+this.age+" Living Place "+this.livingPlace);
	}
}
