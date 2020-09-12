package com.xworkz.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListInteger {

	public static void main(String[] args) {
		System.out.println("mms");
		List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
		System.out.println(integers);
		int sum = 0;
		Integer max = integers.stream().max((i1, i2) -> i1.compareTo(i2)).get();

		Integer min = integers.stream().min((i1, i2) -> i1.compareTo(i2)).get();

		List<Integer> square = integers.stream().map(p -> p * p).collect(Collectors.toList());

		Integer total = integers.stream().collect(Collectors.summingInt(s -> s));

		Double avg = integers.stream().collect(Collectors.averagingInt(a -> a));
		
		System.out.println(" Max value= "+max);
		System.out.println(" Min value= "+min);
		System.out.println(" Square of values= "+square);
		System.out.println(" Sum of values= "+total);
		System.out.println(" Average of values= "+avg);

		System.out.println("mme");
	}

}
