package com.xworkz.threads;

public class Multiples extends Thread {

	@Override
	public void run() {
		System.out.println("This is from thread 2 ");
		System.out.println("Name of the thread " + Thread.currentThread().getName());
		System.out.println("Id of the thred " + Thread.currentThread().getId());

		for (int i = 6; i < 11; i++) {
			System.out.println("the result of " + i + "*5 is= " + i * 5);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Thread 1 is ended");
	}
}
