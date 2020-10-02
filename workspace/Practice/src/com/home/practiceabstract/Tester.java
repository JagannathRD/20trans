package com.home.practiceabstract;

public class Tester {

	public static void main(String[] args) {

		Book mk = new Novel();
		mk.read();
		System.out.println(mk.write());
		System.out.println(mk.name);
		System.out.println(mk.noOfPages);

	}

}
