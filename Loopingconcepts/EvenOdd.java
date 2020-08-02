import java.util.Scanner;

public class EvenOdd {
	void mod(int a) {
		if (a % 2 == 0)
			System.out.println(a + " is even");
		else
			System.out.println(a + " is odd");
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		EvenOdd m = new EvenOdd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		m.mod(sc.nextInt());
		sc.close();

		System.out.println("MME");
	}

}
