package com.home.practiceabstract;

public abstract class Book {
	int noOfPages;
	String name;

	abstract void read();

	abstract String write();

	void close() {
		System.out.println("Closed...");
	}
}
