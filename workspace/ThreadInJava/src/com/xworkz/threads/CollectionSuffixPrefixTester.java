package com.xworkz.threads;

import java.util.Arrays;
import java.util.List;

public class CollectionSuffixPrefixTester {

	public static void main(String[] args) {
		System.out.println("mms");
		
		CollectionSuffixPrefix runnable1 = new CollectionSuffixPrefix();
		Thread t1 = new Thread(runnable1);
		t1.start();

		Runnable runnableT2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("The thread name " + Thread.currentThread().getName() + " The id: "
						+ Thread.currentThread().getId());
				Integer[] intarray = { 1, 2, 3, 4, 5, 6 };
				List<Integer> intA1 = Arrays.asList(intarray);
				for (Integer i : intA1) {
					System.out.println("**" + i);
				}
			}

		};

	Thread thread = new Thread(runnableT2);
	thread.start();
	
	Runnable runnableT3=()->{
		System.out.println("The thread name " + Thread.currentThread().getName() + " The id: "
				+ Thread.currentThread().getId());
		Integer[] intarray = { 1, 2, 3, 4, 5, 6 };
		List<Integer> intA1 = Arrays.asList(intarray);
		for (Integer i : intA1) {
			System.out.println("***" + i);
		}
	};
	Thread thread2 = new Thread(runnableT3);
	thread2.start();
		System.out.println("mme");
	}

}
