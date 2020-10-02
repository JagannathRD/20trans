package WrongPasswordException;

public class FbTester {

	public static void main(String[] args) {

		System.out.println("MMS");
		Fb fb = new Fb();
		try {
			fb.chat("abc");
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		}
		System.out.println("MME");
	}

}
