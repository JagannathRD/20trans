package com.xworkz.exceptionalhandling;

public class ArrayManipulation {
	public static void main(String[] args) {
		System.out.println("MMS");
		array();
		System.out.println("MME");
	}

	static void array() {
		int[] array = { 1, 2, 3, 4 };
		try{
		System.out.println("element at 4th index " + array[4]);
		}catch(ArrayIndexOutOfBoundsException f){
			System.out.println(f+" enter element no. less than index");
			
		}
		
		}
		
		

}