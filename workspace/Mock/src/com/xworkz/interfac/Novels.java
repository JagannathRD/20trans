package com.xworkz.interfac;

public class Novels implements Books{

	@Override
	public void reading() {
		System.out.println("Reading Novel....");
	}

	@Override
	public void writing() {
		System.out.println("Writing points...");
		
	}
	

}
