
public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 145, r = 0, sum = 0, a = n;
		while (n > 0) {
			r = n % 10;
			int fact = 1;
			for (int i = 1; i <= r; i++)
				fact = fact * i;
			sum = sum + fact;
			n = n / 10;
		}
		if (sum == a)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");

	}

}
