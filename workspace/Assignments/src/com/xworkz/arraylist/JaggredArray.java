package com.xworkz.arraylist;

import java.util.ArrayList;

public class JaggredArray {

	public static void main(String[] args) {
		int n=5;
		
		ArrayList<Integer>[] jagg=new ArrayList[n];
		for (int i = 0; i <n; i++) {
			jagg[i]=new ArrayList<Integer>();
		}
		
		jagg[0].add(1);
		jagg[0].add(2);
		jagg[1].add(3);
		jagg[2].add(4);
		jagg[3].add(5);
		jagg[3].add(6);
		jagg[3].add(7);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < jagg[i].size(); j++) {
				System.out.print(jagg[i].get(j)+" ");
			}
			System.out.println();
		}
		
	}

}
