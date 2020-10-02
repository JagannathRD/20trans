package com.xworkz.producerconsumer;

public class CarCommomResource {
	String cars[] = { "Octivia", "Rapid", "Super", "Karoq" };
	boolean flag=false;

	public void put() {
		
		try {
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		if(flag=false){
		for (int j = 0; j < cars.length; j++) {
			System.out.println("Produced Cars " + cars[j]);
			}
			}
		

	}

	public void get() {
		for (int i = 0; i < cars.length; i++) {
			System.out.println("Cars sold " + cars[i]);
		} 

	}

}
