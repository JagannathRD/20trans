
public class Reverse {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		int n = 123, r, rev = 0;
		while (n > 0) {
			r = n % 10;           // 3 2 1
			rev = rev * 10 + r;   // 3 32 321
			n = n / 10;           // 12 1 0
		}

		System.out.println("reverse of 123 is=" + rev);
		System.out.println("Main Method Ended");
	}

}
