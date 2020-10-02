package com.xworkz.threads;

import java.util.Arrays;
import java.util.List;

public class CollectionSuffixPrefix implements Runnable{

	@Override
	public void run() {
		System.out.println("The thread name: "+Thread.currentThread().getName()
				+"The id is "+Thread.currentThread().getId());
		
		Integer[] intArray={1,2,3,4,5,6};
		List<Integer> intAl=Arrays.asList(intArray);
		
		for (Integer integer : intAl) {
			System.out.println("*"+integer);
		}
		
	}

}
