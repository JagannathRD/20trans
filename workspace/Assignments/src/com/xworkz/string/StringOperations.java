package com.xworkz.string;

public class StringOperations {

	public static void main(String[] args) {
		String moto = "Dream Big To Achieve Big";
		char stringToChar = moto.charAt(0);

		char[] toCArr = moto.toCharArray();

		System.out.println(stringToChar);
		System.out.println(moto.toCharArray().length);
		for (int i = 0; i < moto.length(); i++) {
			System.out.println("Converted from String to Char[] " + toCArr[i]);
		}

		System.out.println("No. of Characteres in an Array...");
		int countChar = 1;
		for (int i = 0; i < moto.length(); i++) {
			if ((moto.charAt(i))== ' '&&(moto.charAt(i+1))!= ' ')
				countChar++;
		}
		System.out.println(countChar);

	}

}
