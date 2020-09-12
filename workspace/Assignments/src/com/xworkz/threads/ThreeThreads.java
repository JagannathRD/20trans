package com.xworkz.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeThreads {

	public static void main(String[] args) {
		System.out.println("mms");

		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				ArrayList<Integer> aL = new ArrayList<>();
				aL.add(3);
				aL.add(6);
				aL.add(0);
				aL.add(99);
				for (Integer s : aL) {
					System.out.println(s);
				}
			}
		};
		Thread thread1 = new Thread(t1);
		thread1.start();

		Runnable t2 = () -> {
			ArrayList<String> aL = new ArrayList<>();
			aL.add("ABC");
			aL.add("JRD");
			aL.add("BJP");
			aL.add("MNP");
			for (String s : aL) {
				System.out.println(s);
			}

		};
		Thread thread2 = new Thread(t2);
		thread2.start();

		Runnable t3 = () -> {
			ArrayList<Double> aL = new ArrayList<>();
			aL.add(1.1);
			aL.add(1.3);
			aL.add(0.7);
			aL.add(0.0);
			for (Double s : aL) {
				System.out.println(s);
			}

		};
		Thread thread3 = new Thread(t3);
		thread3.start();

		System.out.println("mme");

	}

}
