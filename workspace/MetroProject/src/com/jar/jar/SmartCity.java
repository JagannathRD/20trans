package com.jar.jar;

public class SmartCity {

	private static SmartCity city=null;
	
	private SmartCity(){

	}
	
	public static SmartCity getSmartCity(){
		
		if (city==null)
		{
			city= new SmartCity();
		}
		return city;
	}
}
