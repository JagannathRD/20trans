package com.xowrkz.anonymous;

public class CountryImpl {

	public static void main(String[] args) {
		System.out.println("MMS");
		Country india = new Country() {

			@Override
			public void nationalAnimal() {
				System.out.println("National animal roars");

			}

			@Override
			public void flag() {
				System.out.println("Unfurling flag");

			}

			@Override
			public void anthem() {
				System.out.println("singing anthem");

			}
		};

		india.anthem();
		india.nationalAnimal();
		india.flag();
		System.out.println("MME");

	}

}
