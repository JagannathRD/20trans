package com.xworkz.singleton;

public class RainTester {

	public static void main(String[] args) {
		System.out.println("mms");
		Rain rain= Rain.getRain();
		
		System.out.println(rain);
		
		Rain rain2= Rain.getRain();
		System.out.println(rain2);
		
		
		
		System.out.println("mme");

	}

}
