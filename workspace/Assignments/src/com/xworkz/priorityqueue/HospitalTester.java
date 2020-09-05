package com.xworkz.priorityqueue;

import java.util.PriorityQueue;

public class HospitalTester {

	public static void main(String[] args) {
		System.out.println("mms");
		PriorityQueue<Hospital> hospital= new PriorityQueue<>();
		hospital.add(new Hospital("Jayadeva", "Bengaluru", "Cardiac"));
		hospital.add(new Hospital("Hosmat", "Bengaluru", "limbs"));
		hospital.add(new Hospital("Kidwai", "Bengaluru", "Cancer"));
		hospital.add(new Hospital("BLDE", "Vijayapura", "General"));
		hospital.forEach(h->System.out.println(h));
		System.out.println("mme");
		
	}

}
