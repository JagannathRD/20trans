package com.xworkz.override2;

public class Tester {

	public static void main(String[] args) {
		System.out.println("MMS");
		Person dashratha = new Son(40, "Ram");
		dashratha.swim();
		dashratha.walk();

		Son ram = new GrandSon(10, "Laxman");
		ram.walk();
		ram.swim();

		System.out.println("MME");
	}

}
