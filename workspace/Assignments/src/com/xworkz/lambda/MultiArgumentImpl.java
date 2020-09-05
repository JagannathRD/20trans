package com.xworkz.lambda;

public class MultiArgumentImpl {

	public static void main(String[] args) {
		System.out.println("MMS");
		MultiArgument mAS = (ab, bc) -> "string+string";

		System.out.println(mAS.concatTwoString("a", "b"));

		System.out.println("MME");

	}

}
