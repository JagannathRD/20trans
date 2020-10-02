package com.xworkz.innerclasses;

final class Car { // Car.java
	private String company = "TATA";

	final public class Engine {            // Car$Engine.java 
		static final String name = "Notron";  // can't be static
		int cc=1000;
		void start() {
			System.out.println("Engine comapnay name " + Car.this.company+name+this.cc);
		}
	}

	void drive() {
		System.out.println("Driving..");
		
		Engine dabba = new Engine(); //calling inner class from instance method
		dabba.start();
	}

	public static void main(String[] args) {
		Car tiago = new Car();
		Car.Engine notron = tiago.new Engine(); //calling inner from static 
		notron.start();

		new Car().new Engine().start();
		System.out.println(Car.Engine.name);
		
		System.out.println("---");
		tiago.drive();

	}
}
