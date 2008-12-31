
public class Sanitizer {
	private int price;
	private String fragrant;
	private double alcoholContent;

	public void setPrice(int inPrice) {
		price = inPrice;
	}

	public int getPrice() {
		System.out.println("Sanitiser price is " + price);
		return price;
	}

	void setFragrance(String inFragrance) {
		fragrant = inFragrance;
	}

	String getFragrance() {
		System.out.println("Sanitiser fragrance is of " + fragrant);
		return fragrant;
	}

	protected void setAlcoholContent(double inAlcoholContent) {
		alcoholContent = inAlcoholContent;
	}

	protected double getAlcoholContent() {
		System.out.println("Sanitiser Alcohol Content is " + alcoholContent);
		return alcoholContent;
	}
}
