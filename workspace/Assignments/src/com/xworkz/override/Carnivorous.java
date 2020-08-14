package com.xworkz.override;

public class Carnivorous extends Animal {

	public Carnivorous(int age, String livingPlace) {
		super(age, livingPlace);
		
	}

	@Override
	void eats() {
		System.out.println("Carnivorous eats");
	}

	@Override
	void drinks() {
		System.out.println("Carnivorous drinks");
	}

	@Override
	void sleeps() {
		System.out.println("Carnivorous sleeps");
	}
	@Override
	void getAnimalDetails(){
		System.out.println("Age "+this.age+" Living Place "+this.livingPlace);
	}
}
