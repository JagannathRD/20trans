package com.xworkz.string;

public class NoOfCharString {

	public static void main(String[] args) {
		System.out.println("MMS");
		String string="A Beautiful Lady";
		int noOfChar=0;
		
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)!=' '){
				noOfChar++;
			}
		}
		
		System.out.println("No Of Characters= "+noOfChar);
		
		System.out.println("MME");

	}

}
