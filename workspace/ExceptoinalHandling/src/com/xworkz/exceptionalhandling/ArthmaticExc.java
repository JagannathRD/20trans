package com.xworkz.exceptionalhandling;

import java.util.Scanner;

public class ArthmaticExc {

	public static void main(String[] args) {
		System.out.println("MMS");
		divMethod();
		System.out.println("MME");
	}
	static void divMethod(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers to divide: a= ");
		int a=sc.nextInt();
		System.out.println("Enter numbers to divide: b= ");
		int b=sc.nextInt();
		sc.close();
		try{
		int div=a/b;
		System.out.println(div);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	}
	
}
