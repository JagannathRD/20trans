
public class Big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 8 };
		for (int tempVar : arr) {
			System.out.println(tempVar);
		}
		int big = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				big = arr[0];
				if (arr[i] < arr[j]) {
					big = arr[j];
				}
			}

		}
		System.out.println(big);
	}

}
