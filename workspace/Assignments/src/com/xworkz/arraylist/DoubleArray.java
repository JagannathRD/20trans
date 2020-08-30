package com.xworkz.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class DoubleArray {

	public static void main(String[] args) {
		System.out.println("MMS");
		ArrayList<Double> arrayList = new ArrayList<Double>();

		arrayList.add(1.1);
		arrayList.add(1.2);
		arrayList.add(1.3);
		arrayList.add(1.4);
		arrayList.add(1.22);
		arrayList.add(1.23);
		arrayList.add(1.12);
		arrayList.add(1.13);
		arrayList.add(1.26);
		arrayList.add(1.32);
		arrayList.add(1.6);

		Collections.sort(arrayList);
		
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		arrayList.sort(Collections.reverseOrder());
		System.out.println(arrayList);

		System.out.println("MME");

	}

}
