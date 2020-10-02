package com.xworkz.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		int i=10;
		String s="32 ",b="j";
		String a[]={};
		
		try{
			//int res=i/0;
			//System.out.println(a[3]);
			
			System.out.println(Integer.parseInt(s));
		}catch(Exception e){
			
		}
		finally {
			System.out.println("It will print anyway");
		}
		System.out.println("Hello guys");

	}

}
