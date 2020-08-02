
public class pattern {

	static void print(int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		print(5);
	}
}
