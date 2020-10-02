package com.xworkz.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapex {

	public static void main(String[] args) {
		System.out.println("mms");
		LinkedHashMap<Integer, String> lHM=new LinkedHashMap();
		lHM.put(560040, "Vijayanagar");
		lHM.put(560042, "Rajajinagar");
		lHM.put(580001,"J P Nagar");
		
		System.out.println(lHM);
		System.out.println(lHM.get(560040));
		System.out.println(lHM.get(560042));
		System.out.println(lHM.get(580001));
		System.out.println("mme");

	}

}
