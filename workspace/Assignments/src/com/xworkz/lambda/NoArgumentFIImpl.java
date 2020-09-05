package com.xworkz.lambda;

public class NoArgumentFIImpl {

	public static void main(String[] args) {
		System.out.println("MMS");
		

	
	NoArgumentFI nFImpl=()->{System.out.println("Hello world");};
	nFImpl.printHello();

}
}
