package com.xworkz.wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {
		System.out.println("MMS");
		int a=10;
		Integer b=a;//autoboxing
		Integer i=30;//autoboxing
		
		Integer c= new Integer(a);//Boxing
		
		char d='A';
		Character e=new Character('A');
		Character f='A';
		
		
		int unboxedint =b.intValue(); //unboxing
		int autounboxing=b;//autounboxing
		
		System.out.println(c);
		System.out.println(b.toString());
		System.out.println("MME");

	}

}
