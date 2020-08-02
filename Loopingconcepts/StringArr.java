import java.util.Scanner;

public class StringArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MMS");
		int n = 4;
		String[] stringArr = new String[n];

		System.out.println("Enter 4 Names:");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < stringArr.length; i++) {
			stringArr[i] = sc.next();
		}
		sc.close();
		for (String tempVar : stringArr) {
			System.out.println("====" + tempVar + "***");
		}
		System.out.println("MME");
	}

}
