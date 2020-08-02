
public class Bag {
	double price;
	String brand;
	int liters;
	boolean isMadeOfLeather;

	Bag() {
		System.out.println("NO-arg Constructor");
	}

	Bag(double rate, String bname, int capacity, boolean madeof) {
		price = rate;
		brand = bname;
		liters = capacity;
		isMadeOfLeather = madeof;

	}

	Bag(double rate, String bname) {
		price = rate;
		brand = bname;
	}

	void openTheBag() {
		System.out.println("Zip open...");
	}

	void move() {
		System.out.println("Moving...");
	}

	void storeItems() {
		System.out.println("Stored...");
	}

	void close() {
		System.out.println("zip close....");
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		Bag newBag = new Bag();
		System.out.println("Brand " + newBag.brand + " Bag price " + newBag.price + " Bag capacity " + newBag.liters
				+ " Bag is of Leather " + newBag.isMadeOfLeather);
		System.out.println("----------");

		Bag allBag = new Bag(5000, "Zara", 20, true);
		System.out.println("Brand " + allBag.brand + " Bag price " + allBag.price + " Bag capacity " + allBag.liters
				+ " Bag is of Leather " + allBag.isMadeOfLeather);
		System.out.println("----------");

		Bag twoBag = new Bag(4000, "Levi's");
		System.out.println("Brand " + twoBag.brand + " Bag price " + twoBag.price + " Bag capacity " + twoBag.liters
				+ " Bag is of Leather " + twoBag.isMadeOfLeather);
		twoBag.openTheBag();
		twoBag.move();
		twoBag.storeItems();
		twoBag.close();

		System.out.println("MME");
	}
}
