package com.xworkz.treesetex;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeTester {

	public static void main(String[] args) {
		System.out.println("mms");
		TreeSet<Tree> treeSet= new TreeSet<>();
		treeSet.add(new Tree("Mango", 20, "India"));
		treeSet.add(new Tree("Coconut", 30, "India"));
		treeSet.add(new Tree("Coffee", 5, "Arabia"));
		treeSet.add(new Tree("Potato", 1, "USA"));
		
		treeSet.forEach(t->System.out.println(t));
		
		System.out.println("---Iterator---");
		Iterator<Tree> itr=treeSet.iterator();
		while (itr.hasNext()) {
			System.out.println( itr.next());
			
		}
		System.out.println("---for each---");
		treeSet.forEach(t->System.out.println(t));
		System.out.println(treeSet);
		
		System.out.println("mme");
	}

}
