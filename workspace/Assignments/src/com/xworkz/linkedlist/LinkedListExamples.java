package com.xworkz.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import com.xworkz.arraylist.*;

public class LinkedListExamples {

	public static void main(String[] args) {
		System.out.println("MMS");
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Kannada");
		linkedList.offer("Telugu");
		linkedList.addFirst("Hindi");
		linkedList.addLast("Tamil");
		linkedList.add(2, "Malayalam");
		System.out.println(linkedList.addAll(linkedList));

		try {
			linkedList.addAll(3, null);
		} catch (Exception e) {
			System.out.println(e);
		}

		Iterator<String> itr = linkedList.iterator();
		while (itr.hasNext()) {
			itr.next();
			System.out.println(itr.next());
		}

		System.out.println("--List iterator--");

		ListIterator<String> listItr = linkedList.listIterator();
		while (listItr.hasNext()) {

			System.out.println(listItr.next());
		}
		System.out.println("-----");
		System.out.println("Peek Gives the 1st element= " + linkedList.peek());
		System.out.println("Element Gives the 1st element= " + linkedList.element());
		System.out.println("get first Gives the 1st element= " + linkedList.getFirst());
		System.out.println("getlast Gives the last element= " + linkedList.getLast());
		System.out.println("Remove operations");
		System.out.println("Retrieves and removes the head (first element) of this list "+linkedList.remove());
		System.out.println("Retrieves and removes the head (first element) of this list "+linkedList.poll());
		System.out.println("Retrieves and removes the head (first element) of this list "+linkedList.pollFirst());
		System.out.println("Retrieves, but does not remove, the head of this queue"+linkedList.peekLast());
		System.out.println("MME");

	}

}
