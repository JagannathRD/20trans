
public class Swap {
	int temp = 0;

	void interchange(int a, int b) {
		temp = a;
		a = b;
		b = temp;
		System.out.println("New Value of a is " + a + " & New Value of b is " + b);
	}

	public static void main(String[] args) {
		System.out.println("MMS");

		Swap process = new Swap();
		int a = 10, b = 20;
		process.interchange(a, b);

		System.out.println("MME");
	}
}
