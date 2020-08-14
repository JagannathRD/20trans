package com.xworkz.customex;

public class Mobile {
	boolean isSmartPhone;
	double price;

	void calling() {
		System.out.println("calling....");
	}

	void makeVideoCall(boolean isSmartPhone ) throws NotSmartException {
		if(isSmartPhone== false)
			throw new NotSmartException("Basic set");
		System.out.println("video call...");
	}
}
