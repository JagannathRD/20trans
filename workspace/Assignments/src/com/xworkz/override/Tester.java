package com.xworkz.override;

public class Tester {

	public static void main(String[] args) {
		System.out.println("MMS");
		Animal anim = new Animal(20, "Jungle");
		anim.eats();
		anim.sleeps();
		anim.drinks();
		anim.getAnimalDetails();

		Herbivorous veg = new Herbivorous(10, "Lawn");
		veg.eats();
		veg.drinks();
		veg.sleeps();
		veg.getAnimalDetails();

		Carnivorous wild = new Carnivorous(15, "Den");
		wild.eats();
		wild.drinks();
		wild.sleeps();
		wild.getAnimalDetails();

		System.out.println("MME");

	}

}
