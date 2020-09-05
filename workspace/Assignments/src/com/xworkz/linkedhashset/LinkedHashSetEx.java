package com.xworkz.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet();
		
		linkedHashSet.add('J');
		linkedHashSet.add('A');
		linkedHashSet.add('G');
		linkedHashSet.add('G');
		linkedHashSet.add('U');
		
		System.out.println("---for each---");
		linkedHashSet.forEach(l->System.out.println(l));
		
		System.out.println("---iterator---");
		Iterator<Character> itr= linkedHashSet.iterator();
		while (itr.hasNext()) {
			System.out.println( itr.next());
			
		}

	}

}
