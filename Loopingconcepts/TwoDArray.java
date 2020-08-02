
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MMS");
		int[][] twoArr;
		twoArr = new int[2][2];
		twoArr[0][0] = 1;
		twoArr[0][1] = 2;
		twoArr[1][0] = 3;
		twoArr[1][1] = 4;
		System.out.println("2*2 ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(twoArr[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("2*2 using literal ");

		int[][] twoArr2 = { { 10, 20 }, { 30, 40 }, { 50, 60 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(twoArr2[i][j] + " ");
			}
			System.out.println(" ");
		}

		System.out.println("3*3 using literal ");
		int[][] twoArr3 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(twoArr3[i][j] + " ");
			}
			System.out.println(" ");
		}

		System.out.println("MME");
	}

}
