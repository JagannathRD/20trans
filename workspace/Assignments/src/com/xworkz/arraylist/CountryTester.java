package com.xworkz.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CountryTester {

	public static void main(String[] args) {
		System.out.println("mms");
		
		ArrayList<Country> counry= new ArrayList<>();
		
		counry.add(new Country(28, "India", 91));
		counry.add(new Country(7, "Nepal", 977));
		counry.add(new Country(20, "Bhutan", 975));
		counry.add(new Country(25, "Srilanka", 94));
		counry.add(new Country(50, "USA", 1));
		
		for (Country country : counry) {
			System.out.println(country);
		}
		
		
		Collections.sort(counry);
		for (Country country : counry) {
			System.out.println(country);
		}
		
		
		System.out.println("mme");

	}

}
