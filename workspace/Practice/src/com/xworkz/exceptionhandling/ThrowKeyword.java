package com.xworkz.exceptionhandling;

public class ThrowKeyword {
	 int age;

	 void validate(int inAge) throws Custom {
		if (age < 18)
			
				throw new Custom();
			 
		else
			System.out.println("can vote");
		
	};
	public static void main(String[] args)  {
		ThrowKeyword throwKeyword = new ThrowKeyword();
		
			try {
				throwKeyword.validate(13);
			} catch (Custom d) {
				
				d.disply();
			}
		
			
			
		
		System.out.println("MME");
	}
}
