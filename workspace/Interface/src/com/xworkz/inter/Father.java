package com.xworkz.inter;

public interface Father {
	                                                         
	void working();

	default void singing() {
		System.out.println("Father Singing...");
	};
}
