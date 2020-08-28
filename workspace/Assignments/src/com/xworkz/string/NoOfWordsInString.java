package com.xworkz.string;

public class NoOfWordsInString {

	public static void main(String[] args) {
		System.out.println("MMS");
		String string="A Beautiful Lady";
		
		String[] y=string.split(" ");  //using built in function
		
		int noOfWords=1;
		
		for (int i = 0; i < string.length(); i++) {
			if((string.charAt(i)==' ') && (string.charAt(i+1)!=' ')){
				noOfWords++;
			}
		}
		
		System.out.println("No of words in the string= "+noOfWords);
		
		System.out.println(y.length);
		System.out.println("MME");

	}

}
