package com.xworkz.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedInTester {

	public static void main(String[] args) {
		System.out.println("MMS");
		LinkedHashSet<LinkedIn> linkedIn = new LinkedHashSet<>();
		linkedIn.add(new LinkedIn("Jaggu", 30));
		linkedIn.add(new LinkedIn("Basu", 29));
		linkedIn.add(new LinkedIn("Amit", 30));
		linkedIn.add(new LinkedIn("shri", 29));
		
		System.out.println("---for each---");
		linkedIn.forEach(l->System.out.println(l));
		
		System.out.println("---Iterator---");
		Iterator<LinkedIn> itr=linkedIn.iterator();
		while (itr.hasNext()) {
			System.out.println( itr.next());
			
		}
		System.out.println("MME");
	}

}
