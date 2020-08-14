package com.xworkz.override;

public class Animal {
	int age;
	String livingPlace;
	
	public Animal(int age, String livingPlace) {
		this.age=age;
		this.livingPlace=livingPlace;
	}
	void eats() {
		System.out.println("Eats");
	}

	void drinks() {
		System.out.println("Drinks");
	}

	void sleeps() {
		System.out.println("Sleeps");
	}
	
	void getAnimalDetails(){
		System.out.println("Age "+this.age+" Living Place "+this.livingPlace);
	}
}
