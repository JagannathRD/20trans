package com.xworkz.equalsandhashcode;

import java.util.HashSet;

public class TraineeTester {

	public static void main(String[] args) {
		System.out.println("mms");
		Trainee krupa1= new Trainee(1, "Krupa");
		Trainee krupa2= new Trainee(1, "Krupa");
		Trainee shrikar= new Trainee(2, "Shrikar");
		
		System.out.println(krupa1.equals(krupa2));
		
		HashSet<Trainee> traineeSet= new HashSet<>();
		traineeSet.add(krupa1);
		traineeSet.add(shrikar);
		traineeSet.add(krupa2);
		
		System.out.println("Set is :"+traineeSet);
		
		System.out.println("mme");
	}

}
