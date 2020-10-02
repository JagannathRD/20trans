package com.xworkz.inter;

public class MathsOperationTester {

	public static void main(String[] args) {
		System.out.println("MMS");
		MathOperation math= new MathOperationImpl();
		System.out.println(math.add(10, 20));
		System.out.println(math.sub(20, 10));
		
		MathOperation mathann=new MathOperation() {
			
			@Override
			public int sub(int a, int b) {
				// TODO Auto-generated method stub
				return (a+b+5);
			}
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return (a-b-5);
			}
		};
		
		System.out.println(mathann.add(20, 10));
		System.out.println(mathann.sub(20, 10));
		
		System.out.println("MME");
	}

}
