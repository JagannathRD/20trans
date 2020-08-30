package com.xworkz.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class TelevisionTester {

	public static void main(String[] args) {
		System.out.println("MMS");
		ArrayList<Television> television=new ArrayList<>();
		television.add(new Television("LG", 44, "LED"));
		television.add(new Television("Mi", 40, "LCD"));
		television.add(new Television("BPL", 28, "CRT"));
		television.add(new Television("Samsung", 32, "QLED"));
		
		 for (Television television2 : television) {
			System.out.println(television2);
		}
		
		System.out.println("Sort By Brand");
		SortByBrand sortByBrand = new SortByBrand();
		Collections.sort(television, sortByBrand);
		 for (Television television2 : television) {
				System.out.println(television2);
			}
		 
		 System.out.println("Sort By Inches");
			SortByInches sortByInches = new SortByInches();
			Collections.sort(television, sortByInches);
			 for (Television television2 : television) {
					System.out.println(television2);
				}
		 
			 System.out.println("Sort By Types");
				SortByTypes sortByTypes = new SortByTypes();
				Collections.sort(television, sortByTypes);
				 for (Television television2 : television) {
						System.out.println(television2);
					}
		 
		 
		 
		System.out.println("MME");

	}

}
