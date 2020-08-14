package com.xworkz.override2;

public class GrandSon extends Son {
	GrandSon(int age, String name) {
		super(age, name);
	}

	@Override
	void walk() {
		System.out.println("Grand Son walks");
	}

	@Override
	void swim() {
		System.out.println("Grand Son swims");
	}

}
