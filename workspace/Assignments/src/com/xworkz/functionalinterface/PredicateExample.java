package com.xworkz.functionalinterface;

import java.util.function.*;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i % 2 == 0;// for conditional checks
		System.out.println(p.test(10));
		System.out.println(p.test(15));

	}

}
