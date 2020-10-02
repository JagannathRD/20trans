package com.xworkz.innerclasses;

public class Book {
	String type = "Novel";

	void reading() {
		System.out.println("Calling inner class from method");
		class Pages {
			void turnPages() {
				System.out.println("Turning the pages....");
			}
		}
		Pages p=new Pages();
		p.turnPages();
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		Book bk= new Book();
		
		System.out.println("MME");
	}
}
