package com.xworkz.threads;

public class TablesOfGivenNumber {

		void multiplesOfNumber(int number){
			
			System.out.println("The thread ecxecuting is: "+Thread.currentThread().getName());
			System.out.println("The thread ecxecuting is: "+Thread.currentThread().getId());
			
			System.out.println("The table of the number"+ number+" is: ");
			
			for(int i=1; i<=10; i++){
				System.out.println(i+" * "+number+" = "+(i*number));
			}
		}
}
