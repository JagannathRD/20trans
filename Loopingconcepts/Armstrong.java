
public class Armstrong {
	void check(int a) {
		int r = 0, sum = 0, input = a;
		while (a > 0) {
			r = a % 10; // 3 5 1
			a = a / 10; // 15 1
			sum = sum + r * r * r; // 27 125 1
		}
		if (input == sum)
			System.out.println(input + " is a Armstrong Number");
		else
			System.out.println(input + " is not a Armstrong Number");
	}

	public static void main(String[] args) {
		System.out.println("MMs");

		Armstrong arm = new Armstrong();
		arm.check(153);

		System.out.println("MME");
	}
}
