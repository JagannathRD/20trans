package com.xworkz.functionalinterface;

import java.util.function.*;

public class ConsumerFI {

	public static void main(String[] args) {
		Consumer<Integer> display = a -> System.out.println(a * 20);
		display.accept(10);

		Consumer<String> name = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		};
		name.accept("Jagannath");
	}

}
