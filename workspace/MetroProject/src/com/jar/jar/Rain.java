package com.jar.jar;

public class Rain {

	private static Rain rain = new Rain();
	
	private Rain(){
		System.out.println(this.getClass().getSimpleName());
	}
	
	public static Rain getRain(){
		return rain;
	}
}
