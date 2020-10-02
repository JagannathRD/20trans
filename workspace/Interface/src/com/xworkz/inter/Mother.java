package com.xworkz.inter;

public interface Mother {
	void cooking();

	default void singing() {
		System.out.println("Mother singing...");
	}
}
