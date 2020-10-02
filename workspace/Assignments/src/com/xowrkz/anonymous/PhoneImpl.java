package com.xowrkz.anonymous;

public class PhoneImpl {

	public static void main(String[] args) {
		System.out.println("MMS");

		Phone smartPhone = new Phone() {

			@Override
			public void gaming() {
				System.out.println("Gaming in smartphone");

			}

			@Override
			public void calling() {
				System.out.println("Calling smartphone");

			}

			@Override
			public void browsing() {
				System.out.println("Browsing in smartphone");

			}
		};

		Phone keypadPhone = new Phone() {

			@Override
			public void gaming() {
				System.out.println("Gaming in keypadphone");

			}

			@Override
			public void calling() {
				System.out.println("Calling keypadphone");

			}

			@Override
			public void browsing() {
				System.out.println("Browsing in keypadphone");

			}
		};

		smartPhone.browsing();
		smartPhone.calling();
		smartPhone.gaming();

		keypadPhone.browsing();
		keypadPhone.gaming();
		keypadPhone.calling();

		System.out.println("MME");
	}

}
