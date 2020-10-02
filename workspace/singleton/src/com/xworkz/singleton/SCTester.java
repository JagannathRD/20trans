package com.xworkz.singleton;

public class SCTester {

	public static void main(String[] args) {
		System.out.println("mms");
		
		SmartCity smartcity=SmartCity.getSmartCity();		
		System.out.println(smartcity);
		
		SmartCity smartcity2=SmartCity.getSmartCity();
		System.out.println(smartcity2);
		
		System.out.println("mme");

	}

}
