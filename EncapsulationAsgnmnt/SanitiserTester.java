
public class SanitiserTester {
	public static void main(String[] args) {
		System.out.println("MMS");

		Sanitizer san = new Sanitizer();

		san.setAlcoholContent(79.22);
		san.setFragrance("jasmin");
		san.setPrice(90);
		san.getPrice();
		san.getFragrance();
		san.getAlcoholContent();
		System.out.println("MME");
	}
}
