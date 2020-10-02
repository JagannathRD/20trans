package com.xworkz.producerconsumer;

public class ProducerConsumerTester {

	public static void main(String[] args) {
		System.out.println("mms");

		CarCommomResource cr = new CarCommomResource();

		Runnable producer = new Runnable() {

			@Override
			public void run() {

				cr.put();

			}
		};

		Thread t1 = new Thread(producer);
		t1.run();

		Runnable consumer = new Runnable() {

			@Override
			public void run() {

				cr.get();
			}
		};
		Thread t2 = new Thread(consumer);
		t2.run();

		System.out.println("mme");
	}

}
