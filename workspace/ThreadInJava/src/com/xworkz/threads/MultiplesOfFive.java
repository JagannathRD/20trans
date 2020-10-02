package com.xworkz.threads;

public class MultiplesOfFive extends Thread {

	@Override
	public void run() {
		System.out.println("This is from thread 1 ");
		System.out.println("Name of the thread " + Thread.currentThread().getName());
		System.out.println("Id of the thred " + Thread.currentThread().getId());

		for (int i = 1; i < 5; i++) {
			System.out.println("the result of " + i + "*5 is=" + i * 5);
		}
		System.out.println("Thread 1 is ended");
	}
}
