class TriangularMatrix {
	public static void main(String[] args) {
		System.out.println("MMS");

		int[][] arr = { { 98, 14, 19, 84 }, { 75, 5, 36, 56 }, { 25, 45, 96, 51 }, { 10, 88, 43, 79 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] - arr[i] == 0)
					System.out.println(arr[i][j]);
			}
		}

		System.out.println("MME");
	}
}