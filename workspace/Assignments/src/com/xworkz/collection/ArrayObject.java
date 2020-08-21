package com.xworkz.collection;

import java.util.ArrayList;

public class ArrayObject {

	public static void main(String[] args) {
		
		Bike splendor= new Bike();
		Bike pulsr=new Bike("Bajaj", 180);
		Bike classic=new Bike("RE", 220);
		Bike fz=new Bike("Yamaha", 180);
		
		ArrayList<Bike> splBk=new ArrayList<Bike>();
		splBk.add(splendor);
		splBk.add(pulsr);
		splBk.add(fz);
		splBk.add(classic);
		
		
		System.out.println(splBk);
		for(Bike ref:splBk){
			System.out.println("Brand "+ref.brand+" CC "+ref.cc);
		}

	}

}
