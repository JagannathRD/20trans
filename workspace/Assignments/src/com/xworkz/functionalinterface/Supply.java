package com.xworkz.fi;

import java.util.function.Supplier;

public class Supply {

	public static void main(String[] args) {
		Supplier<String> name = new Supplier() {
			@Override
			public String get() {

				return new String("Jaggu");
			}

		};
		System.out.println(name.get());

		Supplier<String> name1 = () -> {
			return new String("Jagannath");
		};
		System.out.println(name1.get());

		Supplier<String> name2 = () -> "JagannathDindoor";
		System.out.println(name2.get());
	}

}
