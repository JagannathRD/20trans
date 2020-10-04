package com.xworkz.abstraction;

public class LightFactory {

	public static ISwitch getLight(String type){
		if (type.equalsIgnoreCase("Tubelight"))
			return new TubeLightImpl();
		else if (type.equalsIgnoreCase("cflbulb"))
			return new CFLBulbImpl();
		else 
			System.out.println("light not found");
		return null;
	}
}
