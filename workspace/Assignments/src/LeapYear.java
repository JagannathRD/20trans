import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");

		int year = sc.nextInt();
		sc.close();
		if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {

			System.out.println("leap year");
		} else
			System.out.println("not a leap year");

		System.out.println("Main Method Ended...");

	}

}
