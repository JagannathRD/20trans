package com.xworkz.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import com.xworkz.collectionExamples.Arraylists;

public class MountainTester {

	public static void main(String[] args) {
		System.out.println("mms");
		ArrayList<Mountains> arrayList = new ArrayList<>();

		arrayList.add(new Mountains(8.84, "Everest", "Nepal"));
		arrayList.add(new Mountains(8.61, "K2", "India"));
		arrayList.add(new Mountains(8.52, "Lhotse", "Nepal"));
		arrayList.add(new Mountains(8.48, "Makalu", "Nepal"));
		arrayList.add(new Mountains(5.9, "Kilimanjaro", "Africa"));

		System.out.println("Using for each");
		for (Mountains mountains : arrayList) {
			System.out.println(mountains);
		}
		System.out.println("Using for each collectionr");
		arrayList.forEach(m -> System.out.println(m));
		
		System.out.println("Using iterator");
		Iterator<Mountains> itr=arrayList.iterator();
		while (itr.hasNext()) {
			Mountains mountains = (Mountains) itr.next();
			System.out.println(mountains);
		}
		System.out.println("mme");

	}

}
