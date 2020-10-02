package com.xworkz.exceptionhandling;

public class NullPointerExcept {
public static void main(String[] args) {
	System.out.println("MMS");
	String name=null;
	try{
	int l=name.length();
	System.out.println(""+l);
	}catch(NullPointerException e){
		System.out.println("name can't be null,please enter name");
	}
	System.out.println("MME");
}
}
