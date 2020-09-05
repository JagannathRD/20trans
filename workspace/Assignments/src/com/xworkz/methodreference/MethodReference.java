package com.xworkz.methodreference;

public class MethodReference {
	public static void Method2(){
		System.out.println("static method");
	}
	public static void main(String[] args) {
		
Refrencing reference =MethodReference::Method2;
	}

}
