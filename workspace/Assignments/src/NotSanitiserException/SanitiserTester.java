package NotSanitiserException;

public class SanitiserTester {
	public static void main(String[] args) {
		System.out.println("MMS ");

		Sanitizer san = new Sanitizer();

		try {
			san.setAlcoholContent(7);
		} catch (NotSanitiserException e) {
			e.printStackTrace();
		}
		san.setFragrance("jasmin");
		san.setPrice(90);
		san.getPrice();
		san.getFragrance();
		san.getAlcoholContent();
		System.out.println("MME");
	}
}
