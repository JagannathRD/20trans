import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MMS");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");

		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int tempVar : arr) {
			System.out.println(tempVar * 5);
		}

		System.out.println("MME");
	}

}
