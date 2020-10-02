package com.xworkz.threads;

public class DelayTester {

	public static void main(String[] args) {
	System.out.println("mms");
	Runnable r1=()->{
		for (int i = 1; i <=5; i++) {
			System.out.println("Counting: "+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	};
	
	
	Runnable r2=()->{
		for (int i = 6; i <=10; i++) {
			System.out.println("Counting: "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	};
	
	Thread t1= new Thread(r1);
	t1.start();
	
	Thread t2= new Thread(r2);
	t2.start();
	
	System.out.println("mme");
	}

}
