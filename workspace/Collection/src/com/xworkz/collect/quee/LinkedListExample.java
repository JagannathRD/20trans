package com.xworkz.collect.quee;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		System.out.println("mms");
		LinkedList<Integer> intLinkedList=new  LinkedList<>();
		
		intLinkedList.add(12);
		intLinkedList.add(12);
		intLinkedList.add(2, 3);
		intLinkedList.addFirst(1);
		intLinkedList.add(0, 0);
		intLinkedList.addFirst(5);
		intLinkedList.add(7);
		
		
		System.out.println(intLinkedList);
		
		ListIterator<Integer> listItr=intLinkedList.listIterator();
		while(listItr.hasNext()){
			Integer i=listItr.next();
			System.out.println(i+" Index "+listItr.nextIndex());
		}
		
		System.out.println("mme");
	} 

}
