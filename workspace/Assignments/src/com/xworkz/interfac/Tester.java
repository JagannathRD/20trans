package com.xworkz.interfac;

public class Tester {

	public static void main(String[] args) {
		System.out.println("MMS");
		Pen penImplement=new Implimenting() ;
			penImplement.write();
			
			Reynolds reynoldsImplement=new Implimenting();
			reynoldsImplement.draw();
			
			Implimenting implement=new Implimenting();
			implement.write();
			implement.draw();
	}
}
