package com.xworkz.switchexample;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		System.out.println("Enter marks");
		Scanner scanner = new Scanner(System.in);
		int m=scanner.nextInt();
		
		switch (m) {
		case 85:System.out.println("Distinction");
			
			break;
		case 60:System.out.println("fs class");
		break;
		case 45:System.out.println("sc class");
		break;
		case 35:System.out.println("just pass");
		break;
		default:System.out.println("wrong entry");
			break;
		}

	}

}
