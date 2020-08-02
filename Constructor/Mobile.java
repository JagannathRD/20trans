
public class Mobile {

	String brand;
	int ram;
	boolean isSmartphone;
	double price;

	Mobile() {
		System.out.println("constructor calling");
		brand = "Samsung";
		ram = 5;
		isSmartphone = true;
		price = 5000;
		System.out.println("constructor ended");

	}

	void makeCall(long phoneNo) {
		System.out.println("calling...." + phoneNo);
	}

	void charging(boolean isCharging) {
		System.out.println("charging.....");
	}

	void locked(boolean isLocked) {
		System.out.println(isLocked);
	}

	public static void main(String[] args) {
		System.out.println("MMS");

		Mobile nokia = new Mobile();

		System.out.println("brand " + nokia.brand + " isSmartphone " + nokia.isSmartphone + " Price " + nokia.price
				+ "ram " + nokia.ram);
		nokia.brand = "Nokia";
		nokia.ram = 9;
		System.out.println("brand " + nokia.brand + " isSmartphone " + nokia.isSmartphone + " Price " + nokia.price
				+ "ram " + nokia.ram);

		System.out.println("mme");
	}
}
