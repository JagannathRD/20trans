
public class IdCard {
	int idNumber;
	String name;
	boolean isDigital;
	String material;

	IdCard() {
		System.out.println("NO-arg Constructor");
	}

	IdCard(int number, String sname, boolean digital, String madeOf) {
		idNumber = number;
		name = sname;
		isDigital = digital;
		material = madeOf;

	}

	IdCard(int number, boolean digital, String madeOf) {
		idNumber = number;
		isDigital = digital;
		material = madeOf;

	}

	void swipeCard() {
		System.out.println("Swipe...");
	}

	void tieCard() {
		System.out.println("Tied...");
	}

	void verifyCard() {
		System.out.println("Verified...");
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		IdCard newId = new IdCard();
		System.out.println("Number " + newId.idNumber + " Name " + newId.name + " Is it digital " + newId.isDigital
				+ " Is made of " + newId.material);
		System.out.println("----------");

		IdCard recentId = new IdCard(123, "Zara", true, "plastic");
		System.out.println("Number " + recentId.idNumber + " Name " + recentId.name + " Is it digital "
				+ recentId.isDigital + " Is made of " + recentId.material);
		System.out.println("----------");

		IdCard oldId = new IdCard(410, false, "Paper");
		System.out.println("Number " + oldId.idNumber + " Name " + oldId.name + " Is it digital " + oldId.isDigital
				+ " Is made of " + oldId.material);
		oldId.swipeCard();
		oldId.tieCard();
		oldId.verifyCard();

		System.out.println("MME");
	}
}
