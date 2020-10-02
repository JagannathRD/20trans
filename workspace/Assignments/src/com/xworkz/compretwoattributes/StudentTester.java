package com.xworkz.compretwoattributes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentTester {

	public static void main(String[] args) {
		System.out.println("mms");
		ArrayList<Student> student= new ArrayList<>();
		student.add(new Student(16, "Rohan", "J P Nagar"));
		student.add(new Student(16, "Rahul", "R R Nagar"));
		student.add(new Student(18, "Rekha", "Rajajinagar"));
		student.add(new Student(14, "Ruhi", "Jayanagar"));
		
		
		student.forEach(s->System.out.println(s));
		System.out.println("---after sorting---");
		
		Collections.sort(student);
		student.forEach(s->System.out.println(s));
		
		System.out.println(student);
		System.out.println("mme");
	}

}
