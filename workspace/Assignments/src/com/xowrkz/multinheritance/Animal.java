package com.xowrkz.multinheritance;

public class Animal implements Man,Monkey {
	public void eats() {
		System.out.println("Animal eats");
	}

	public void sleeps() {
		System.out.println("Animal sleeps");
	}

	public void drinks() {
		System.out.println("Animal drinks");
	}
}
