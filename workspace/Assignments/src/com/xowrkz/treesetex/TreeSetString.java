package com.xowrkz.treesetex;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetString {

	public static void main(String[] args) {
		System.out.println("mms");
		TreeSet<String> string=new TreeSet<>();
		string.add("Mango");
		string.add("Apple");
		string.add("Pineapple");
		string.add("Orange");
		string.add("Butterfruit");
		
		
		System.out.println("---for each---");
		string.forEach(s->System.out.println(s));
		System.out.println("---iterator");
		Iterator<String> itr=string.iterator();
		while (itr.hasNext()) {
			System.out.println( itr.next());
			
		}
		System.out.println("mme");
	}

}
