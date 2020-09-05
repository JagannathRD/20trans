package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayOfChar {

	public static void main(String[] args) {
		ArrayList<Character> ch = new ArrayList<Character>();

		ch.add('A');
		ch.add('E');
		ch.add('I');
		ch.add('O');
		ch.add('U');
		ch.add('J');
		ch.add('D');
		

		System.out.println("Is empty: " + ch.isEmpty());
		System.out.println("For Loop");
		for (Character c = 0; c < ch.size(); c++) {
			System.out.println(ch.get(c));
		}
		System.out.println("For each-Loop");
		for (Character c : ch) {
			System.out.println(c);
		}
		ch.set(0, 'Z');
		System.out.println(ch);
		System.out.println(ch.get(4));
		ch.remove(2);
		System.out.println(ch);
		System.out.println("Contains Z ? " + ch.contains('Z'));
		ch.remove(new Character('Z'));
		System.out.println(ch);
		
		Collections.sort(ch);
		System.out.println("sorted list "+ch);
	}

}
