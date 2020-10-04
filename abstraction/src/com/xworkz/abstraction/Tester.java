package com.xworkz.abstraction;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		System.out.println("mms");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Light type");
		String type=sc.next();
		ISwitch iSwitch =LightFactory.getLight(type);
		sc.close();
		
		if(iSwitch !=null){
			iSwitch.sOn();
			iSwitch.sOff();
		}
		
		System.out.println("mme");

	}

}
