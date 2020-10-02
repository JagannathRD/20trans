package com.xworkz.inheritance;

public class NovelBook extends Book {
String author="Shivaram Karant";
Boolean Isindex=true;
void read(){
	System.out.println("reading...");
}
public static void main(String[] args) {
	NovelBook BettadaJeeva= new NovelBook();
	BettadaJeeva.read();
	BettadaJeeva.open();
	BettadaJeeva.close();
	BettadaJeeva.noOfPages=300;
	
}
}
