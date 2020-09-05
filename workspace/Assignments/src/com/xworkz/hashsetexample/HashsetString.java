package com.xworkz.hashsetexample;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetString {

	public static void main(String[] args) {
	System.out.println("mms");
	HashSet<String> hashset=new HashSet<>();
	hashset.add("Jagannath");
	hashset.add("Ramanna");
	hashset.add("Dindoor");
	System.out.println("---For each---");
	for (String string : hashset) {
		System.out.println(string);
	}
	System.out.println("---Iteartor---");
	Iterator<String> itr=hashset.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	System.out.println("mme");
	}

}
