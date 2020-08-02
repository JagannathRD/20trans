
public class Vehicle {
	String regNo;
	int noOfWheels;
	String fuelType;

	public Vehicle() {
		System.out.println("NO-arg constructor");
	}

	public Vehicle(String inRegNo, int inNoOfWheels, String inFuelType) {
		regNo = inRegNo;
		noOfWheels = inNoOfWheels;
		fuelType = inFuelType;
	}

	public Vehicle(String inRegNo) {
		regNo = inRegNo;

	}

	public Vehicle(String inRegNo, int inNoOfWheels) {
		regNo = inRegNo;
		noOfWheels = inNoOfWheels;

	}

	void running() {
		System.out.println("running...");
	}

	void applyBrakes(boolean brakes) {
		System.out.println("Apply" + brakes);
	}

	public static void main(String[] args) {
		System.out.println("MMs");
		Vehicle car = new Vehicle();
		System.out.println(" regNO " + car.regNo + " no of wheels " + car.noOfWheels + " fuel type " + car.fuelType);

		Vehicle bike = new Vehicle("KA28 S 4907", 2, "petrol");
		System.out.println(" regNO " + bike.regNo + " no of wheels " + bike.noOfWheels + " fuel type " + bike.fuelType);

		Vehicle truck = new Vehicle("KA25");
		System.out.println(
				" regNO " + truck.regNo + " no of wheels " + truck.noOfWheels + " fuel type " + truck.fuelType);

		System.out.println("MME");
	}
}
