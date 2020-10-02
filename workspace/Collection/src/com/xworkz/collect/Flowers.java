package com.xworkz.collect;

import java.util.ArrayList;

public class Flowers {

	public static void main(String[] args) {
		ArrayList<String> flower = new ArrayList<String>();
		flower.add("Rose");
		flower.add("Lotus");
		flower.add("Hibiscus");
		flower.add("Jasmine");
		
		
		System.out.println(flower);
		for (int i = 0; i < flower.size(); i++) {
			System.out.println(flower.get(i));
		}
		System.out.println("---------");
		flower.remove(0);
		flower.set(1, "Champak");
		flower.get(0);
		System.out.println(flower.contains("Rose"));
		for (String f : flower) {
			System.out.println(f);
		}
		
		

	}

}
