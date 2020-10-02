package com.xworkz.hashmap;

import java.util.Comparator;
import java.util.LinkedHashMap;

public class TraineeTester {

	public static void main(String[] args) {
		System.out.println("mms");
		LinkedHashMap<Trainee, Integer> trainee = new LinkedHashMap<>();
		trainee.put(new Trainee(1, "Krupa"), 20);
		trainee.put(new Trainee(2, "Suva"), 15);
		trainee.put(new Trainee(1, "Krupa"), 20);
		trainee.put(new Trainee(3, "Roopa"), 5);

		System.out.println(trainee);
	

		System.out.println("mme");

	}

}
