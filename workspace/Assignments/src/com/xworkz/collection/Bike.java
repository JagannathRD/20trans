package com.xworkz.collection;

public class Bike {
	String brand;
	int cc;
	double price;

	Bike(){
		System.out.println("df constructor");
	}
	
	Bike(String inBrand,int cc){
		this.brand=inBrand;
		this.cc=cc;
		System.out.println("2param construcor");
	}
	
	void start() {
		System.out.println("Bike starting");
	}

	void stop() {
		System.out.println("Bike stopped");
	}

	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", cc=" + cc + ", price=" + price + "]";
	}
}
