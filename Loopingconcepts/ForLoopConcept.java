import java.util.Scanner;

public class ForLoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char c = sc.next().charAt(0);

		switch (c) {
		case 'A':
			System.out.println("vowel");
			break;

		case 'E':
			System.out.println("vowel");
			break;

		case 'I':
			System.out.println("vowel");
			break;

		case 'O':
			System.out.println("vowel");
			break;

		case 'U':
			System.out.println("vowel");
			break;

		default:
			System.out.println("Consonant");

		}
	}
}