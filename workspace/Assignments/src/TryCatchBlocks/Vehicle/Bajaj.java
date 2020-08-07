package TryCatchBlocks.Vehicle;

public class Bajaj extends Bike {

	void wheeling() {
		System.out.println("Wheeling");
	}

	void getBikeDetails(int noOfWheels, String typeOfEngine, boolean isSelfStart, String model, double price) {
		System.out.println("Wheels " + noOfWheels + " Type of engine " + typeOfEngine + " Self start " + isSelfStart
				+ " Model " + model + " Price " + price);
	}

	public static void main(String[] args) {
		Bajaj pulsar = new Bajaj();
		pulsar.start(true);
		pulsar.stop();
		pulsar.wearHelmet();
		pulsar.wheeling();
		pulsar.getBikeDetails(2, "SI", true, "pulsar-150", 90000);
	}

}
