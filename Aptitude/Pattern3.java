
public class Pattern3 {
	static void pt3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j <= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pt3(5);
	}

}
