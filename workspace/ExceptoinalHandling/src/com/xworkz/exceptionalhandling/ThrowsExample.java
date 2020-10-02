package com.xworkz.exceptionalhandling;

public class ThrowsExample {

	public static void main(String[] args) {
		System.out.println("MMS");
		int a = 10, b = 0;
		ThrowsExample divOp = new ThrowsExample();

		try {
			int result = divOp.division(a, b);
			System.out.println("Result is: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Something went wrong");
		}
		System.out.println("MME");
	}

	int division(int a, int b) throws ArithmeticException {

		int div = 0;
		div = a / b;
		return div;
	}
}
