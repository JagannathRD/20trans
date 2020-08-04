package com.xworkz.exceptionalhandling;

public class TryCatchTypes {
	public static void main(String[] args) {
		System.out.println("MMs");
		multi();
		System.out.println("MME");
	}

	static void multi() {
		int a = 1, b = 0;
		try {

			try {
				int[] arr = { 1, 2, 3 };
				System.out.println(arr[3]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			String name = "JRD";
			int num = Integer.parseInt(name);
			System.out.println(num);
			// int div = a / b;
			// System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (RuntimeException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} catch (Throwable e) {
			System.out.println(e);
		}
	}
}
