package com.xworkz.abstraction;

public class Tester {

	public static void main(String[] args) {
		Car bmw = new BmwCar();
		bmw.applyAccelerator();
		bmw.applyBrake();
		bmw.steeringTurnLeft();
		bmw.steeringTurnRight();

		Car audi = new AudiCar();
		audi.applyAccelerator();
		audi.applyBrake();
		audi.steeringTurnLeft();
		audi.steeringTurnRight();
	}

}
