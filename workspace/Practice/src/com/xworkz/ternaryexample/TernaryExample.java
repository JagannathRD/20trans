package com.xworkz.ternaryexample;

public class TernaryExample {
	public static void main(String[] args) {
		int a = 10, b = 20;

		int max = (a > b) ? a - b : b - a;
		System.out.println(max);

		int c = -9;
		String num = (c > 0) ? "Positve" : (c > 0) ? "Negative" : (c > 0) ? "zeo" : "Blank";
		System.out.println(num);

		int[] arr = { 1, 2, 3, 4 };
		for (int i : arr) {
			System.out.println(i);
			
		}
		
		int[] arr1 = { 1, 2, 3, 4 };
		for (int i = 0; i < arr1.length; i++) {
			
			if(arr1[i]==1){
				continue;
			}
			else
				System.out.println(arr1[i]);
		} 
		
		
		int twoDArr[][] = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < twoDArr.length; i++) {
			for (int j = 0; j < twoDArr.length; j++) {
				System.out.print(twoDArr[i][j]+" ");
				
			}
			System.out.println(" ");

		}
	}
}
