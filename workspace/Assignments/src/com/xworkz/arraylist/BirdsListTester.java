package com.xworkz.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class BirdsListTester {

	public static void main(String[] args) {
		System.out.println("MMS");
		ArrayList<Birds> birds = new ArrayList<>();

		birds.add(new Birds("Parrot", "Green", 1));
		birds.add(new Birds("Penguin", "Black", 1.5));
		birds.add(new Birds("Peacock", "Green", 2));
		birds.add(new Birds("Myna", "Brown", 0.3));

		for (Birds birds2 : birds) {
			System.out.println("For each loop " + birds2);
		}

		birds.forEach(b -> System.out.println("for each of collection " + b));
		
		//System.out.println(bidrs.size());
		//int last=birds.get(bidrs.size()-1);
		//System.out.println("Last element of "+birds.get(bidrs.size()-1));
		
		birds.set(2, (new Birds("Sparrow", "Grey", 0.2)));
		for (Birds birds2 : birds) {
			System.out.println("Updated 3rd element " + birds2);
		}
		
		birds.add(0,new Birds("Dove", "White", 0.1));
		
		for (Birds birds2 : birds) {
			System.out.println("Added at 0th with an element " + birds2);
		}
		
		
		System.out.println("MME");
	}

}
