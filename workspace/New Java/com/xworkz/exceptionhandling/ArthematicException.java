package com.xworkz.exceptionhandling;

import java.util.Scanner;

public class ArthematicException {
	public static void main(String[] args) {
		System.out.println("MMS");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		try {
			int div = a / b;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println("you entered zero in divisor");
		}

		System.out.println("MME");
	}
}
