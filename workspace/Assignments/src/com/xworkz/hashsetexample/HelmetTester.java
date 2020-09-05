package com.xworkz.hashsetexample;

import java.util.HashSet;
import java.util.Iterator;

public class HelmetTester {

	public static void main(String[] args) {
		System.out.println("MMS");
		HashSet<Helmet> helmet=new HashSet<>();
		helmet.add(new Helmet("Vega", 650));
		helmet.add(new Helmet("Honda", 3000));
		helmet.add(new Helmet("Bajaj", 600));
		
		System.out.println("---for each---");
		for (Helmet helmet2 : helmet) {
			System.out.println(helmet2);
		}
		System.out.println("---Iterator---");
		Iterator<Helmet> itr=helmet.iterator();
		while (itr.hasNext()) {
			System.out.println( itr.next());
			
		}
		
		System.out.println("MME");
	}

}
