package com.xworkz.factory;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		System.out.println("mms");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Tyre type/name");
		String type=sc.next();
		
		ITyreStore iTyreStore=TyreFactory.getTyre(type);
		sc.close();
		
		if(iTyreStore !=null){
			iTyreStore.enqiure();
			iTyreStore.buy();
		}
		
		System.out.println("mme");
	}

}
