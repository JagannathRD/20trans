package com.xworkz.string;

public class ReverseAString {

	public static void main(String[] args) {
	System.out.println("MMS");
	
	String string="A Beautiful Lady";
	
	String revereS = "";
	
	 for(int i=string.length()-1;i>=0;i--){
		 revereS=revereS +string.charAt(i);
	 }
	
	System.out.println(revereS);
	
	System.out.println("MME");

	}

}
