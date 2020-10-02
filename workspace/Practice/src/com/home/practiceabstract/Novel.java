package com.home.practiceabstract;

public class Novel extends Book {

	@Override
	void read() {
		System.out.println("Reading novel...");

	}

	@Override
	String write() {

		String S = "Writing story";
		return S;
	}
}
