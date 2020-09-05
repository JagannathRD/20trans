package com.xworkz.collectionExamples;

import java.util.ArrayList;

public class Arraylists {

	public static void main(String[] args) {
		ArrayList<Integer> arInt = new ArrayList<Integer>();
		System.out.println(arInt.isEmpty());
		arInt.add(0);
		arInt.add(7);
		arInt.add(3);
		arInt.add(4);
		arInt.add(5);
		System.out.println(arInt);
		System.out.println("Array size "+arInt.size());
		System.out.println(arInt.contains(new Integer(5)));
		
		System.out.println(arInt.get(1));
		arInt.add(0, 7);//duplicates allowed
		System.out.println(arInt);
		arInt.remove(0);
		System.out.println(arInt);
		try{
		arInt.set(6, 9);
		}catch(Exception e){
			System.out.println(e);
		}
		arInt.remove(new Integer (4));
		System.out.println(arInt);
		System.out.println(arInt.isEmpty());

	}

}
