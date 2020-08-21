package com.xworkz.collection;

import java.util.ArrayList;

public class ArrayListOfDouble {

	public static void main(String[] args) {
		ArrayList<Double> db= new ArrayList<Double>();

		db.add(1.2);
		db.add(1.3);
		db.add(1.4);
		db.add(1.5);
		db.add(1.6);
		db.add(1.7);
		
		System.out.println(db.size());
		System.out.println(db);
		System.out.println("For loop");
		for(double d=0;d<db.size();d++){
			System.out.println(db.get((int) d));
		}
		System.out.println("For each-loop/enhanced for loop");
		for(double dd:db){
			System.out.println(dd);
		}
		
		db.set(2, 56.23);
		System.out.println("Last element");
		System.out.println(db.get(5));
		System.out.println(db);
		db.remove(0);
		System.out.println(db);
		db.remove(new Double(56.23));
	}

}
