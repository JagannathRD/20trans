package TryCatchBlocks.Vehicle;

public class Vehicle {
	int noOfWheels;
	String typeOfEngine;
	double price;
	String model;

	void start(boolean noFuel) {

		if (noFuel == true)
			try {
				throw new Exception("Vehicle won't start");
			} catch (Exception e) {
				e.printStackTrace();
			}

		System.out.println("Vehicle starts...");
	}

	void move() {
		System.out.println("Moving...");
	}

	void stop() {
		System.out.println("Vehicle Stopped");
	}

}
