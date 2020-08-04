package com.xworkz.exceptionalhandling;

public class StringManipulation {
	public static void main(String[] args) {
		System.out.println("MMS");
		stringint();
		System.out.println("MME");
	}

	static void stringint() {
		String name = "Jaggu";

		try {
			int num = Integer.parseInt(name);
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
}
