
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 0, rev = 0, n = 123;
		while (n > 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		System.out.println(rev);
	}

}
