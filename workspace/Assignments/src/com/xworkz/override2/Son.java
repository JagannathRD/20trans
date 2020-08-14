package com.xworkz.override2;

public class Son extends Person {

	Son(int age, String name) {
		super(age, name);

	}

	@Override
	void walk() {
		System.out.println("Son walks");
	}

	@Override
	void swim() {
		System.out.println("Son swims");
	}

}
