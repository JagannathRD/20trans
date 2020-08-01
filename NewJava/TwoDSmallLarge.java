public class TwoDSmallLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 98, 14, 19 }, { 75, 5, 36 }, { 25, 45, 96 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		int small = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = i + 1; k < arr.length; k++) {
					for (int l = j + 1; l < arr.length; l++) {
						small = arr[0][0];
						if (arr[i][j] > arr[k][l]) {
							small = arr[k][l];

						}
					}

				}
			}

		}
		System.out.println(small);
	}
}
