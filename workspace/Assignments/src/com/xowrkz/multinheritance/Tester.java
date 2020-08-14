package com.xowrkz.multinheritance;

public class Tester {

	public static void main(String[] args) {
		System.out.println("MMS");
		Man human = new Animal();
		human.drinks();
		human.eats();
		human.sleeps();

		Monkey monk = new Animal();
		monk.eats();
		monk.drinks();
		monk.sleeps();

		System.out.println("MME");
	}

}
