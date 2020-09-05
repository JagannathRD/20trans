package com.xworkz.lambda;

public class OneArgumentFIImpl {

	public static void main(String[] args) {
	System.out.println("MMS");

	OneArgumentFI inc=a->a+5;
	int res=inc.incrementByFive(10);
	System.out.println(res);
	
	System.out.println("MME");
	}

}
