 package com.xworkz.threads;

public class MultiplesTester {

	public static void main(String[] args) {
		
		
		System.out.println("mms");
		MultiplesOfFive m1= new MultiplesOfFive();
		
		m1.start();
		
		
		
		Multiples m2=new Multiples();
		m2.start();
		
		
		System.out.println("mme");
	}

}
