class Array {
	public static void main(String[] args) {
		System.out.println("MMS");
		String stringArr[] = new String[5];

		double doubleArr[] = { 10, 5.3, 2.0 };

		char charArr[] = { 'A', 'E', 'I', 'O', 'U' };

		stringArr[0] = "Car";
		stringArr[1] = "Bus";
		stringArr[2] = "Car";

		System.out.println("String Arraay");
		for (String tempvar : stringArr) {
			System.out.println(tempvar);
		}

		System.out.println("Double Array");
		for (double tempvar : doubleArr) {
			System.out.println(tempvar);
		}

		System.out.println("Char Array");
		for (char tempvar : charArr) {
			System.out.println(tempvar);
		}

		System.out.println("MME");
	}

}