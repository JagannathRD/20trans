package com.xworkz.functionalinterface;

import java.util.function.*;

public class FunctionExample {

	public static void main(String[] args) {
		
		Function<Integer, Integer> s = i -> i * i;
		System.out.println(s.apply(4));

		Function<String, Integer> length = i -> i.length();
		System.out.println(length.apply("Jagannaths"));
	}

}
