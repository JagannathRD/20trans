package com.xworkz.inter;

public class Son extends Brother implements Father, Mother {

	@Override
	public void cooking() {
		System.out.println("Son cooking");

	}

	@Override
	public void working() {
		System.out.println("Son working");

	}

@Override
	public void singing() {
		System.out.println("Son singing");
		//Father.super.singing();
		//Mother.super.singing();

	}

}
