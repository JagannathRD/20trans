package com.xworkz.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Listex {

	public static void main(String[] args) {
		System.out.println("mms");
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		System.out.println(strings);

		List<String> nonEmptyList = strings.stream().filter(p -> p.length() != 0).collect(Collectors.toList());

		Long empty = strings.stream().filter(p -> p.length() == 0).count();
		List<String> threeChar = strings.stream().filter(p -> p.length() == 3).collect(Collectors.toList());

		System.out.println("Non empty string list "+nonEmptyList);
		System.out.println("Empty strings= "+empty);
		System.out.println("strings with 3 char "+threeChar);
		System.out.println("mme");
	}

}
