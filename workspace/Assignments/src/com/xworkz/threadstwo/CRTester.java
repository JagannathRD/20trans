package com.xworkz.threadstwo;

import java.util.ArrayList;

public class CRTester {

	public static void main(String[] args) {
		System.out.println("mms");

		CommonResource cr1 = new CommonResource();

		Runnable r1 = new Runnable() {

			@Override
			public void run() {

				ArrayList<String> arrayList = new ArrayList<>();
				arrayList.add("Panipuri");
				arrayList.add("Bhel Puri");
				arrayList.add("Dahipuri");

				cr1.collectionPrints(arrayList);

			}
		};

		Runnable r2 = new Runnable() {

			@Override
			public void run() {

				ArrayList<Double> arrayList = new ArrayList<>();
				arrayList.add(10.12);
				arrayList.add(10.20);
				arrayList.add(10.99);
				arrayList.add(1.1);
				arrayList.add(1.2);

				cr1.collectionPrints(arrayList);

			}
		};

		Thread t1 = new Thread(r1);
		t1.run();

		Thread t2 = new Thread(r2);
		t2.run();

		System.out.println("mme");
	}

}
