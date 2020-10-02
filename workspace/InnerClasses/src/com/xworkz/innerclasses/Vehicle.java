package com.xworkz.innerclasses;

class Vehicle { // Vehicle.java
	int regNo = 1214;

	// anonymous class only for overridden and abstratct/interface methods
	void start() {
	}

	void stop() {

	}

	public static void main(String[] args) {

		Vehicle jeep = new Vehicle() { // anonymous class Vehicle$1.java
			@Override
			void start() {
				System.out.println(regNo);
			}
		};
		System.out.println("------");

		Vehicle compass = new Vehicle() { // anonymous class Vehicle$2.java
			@Override
			void start() {
				System.out.println("Starts");
			}

			@Override
			void stop() {
				System.out.println("Stops");
			}
		};
		jeep.start();
		compass.start();
		compass.stop();

	}
}
