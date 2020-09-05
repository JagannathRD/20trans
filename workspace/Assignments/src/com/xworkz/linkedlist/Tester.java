package com.xworkz.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Tester {

	public static void main(String[] args) {
		LinkedList<Student> student=new LinkedList<>();
		student.add(new Student("Jaggu", "ME028",8867814784l));
		student.add(new Student("Shri", "ME029",8867814784l));
		student.add(new Student("Manju", "ME088",8867814784l));
		student.add(new Student("Nagu", "ME008",8867814784l));
		
		
		for (Student student2 : student) {
			System.out.println(student2);
		}
		System.out.println("Iterator traversing");
		
		Iterator<Student> itr=student.iterator();
		while (itr.hasNext()) {
			System.out.println( itr.next());
			
		}
		System.out.println("Iterate with listIterator");
		
		ListIterator<Student> liItr=student.listIterator();
		while (liItr.hasNext()) {
			System.out.println( liItr.next());
			
		}
	}

}
