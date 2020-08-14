package com.xworkz.override2;

public class Person {
	int age;
	String name;

	
	Person(int age,String name){
		this.age=age;
		this.name=name;
		System.out.println("Age "+this.age+" Name "+this.name);
	}
	void walk() {
		System.out.println("Walk");
	}

	void swim() {
		System.out.println("swim");
	}
}
