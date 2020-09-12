package com.xworkz.threads;

import java.util.ArrayList;
import java.util.Iterator;

public class Delay {

	public static void main(String[] args) {
		System.out.println("mms");

		Runnable t1 = () -> {
			ArrayList<String> aLS = new ArrayList<>();
			aLS.add("It");
			aLS.add("is");
			aLS.add("raining");
			aLS.add("heavely");
			
			for (Iterator iterator = aLS.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				System.out.println(string);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		};

		Thread thread = new Thread(t1);
		thread.start();
	

		System.out.println("mme");
	}

}
