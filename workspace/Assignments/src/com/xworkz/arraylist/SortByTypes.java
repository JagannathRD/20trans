package com.xworkz.arraylist;

import java.util.Comparator;

public class SortByTypes implements Comparator<Television>{

	@Override
	public int compare(Television o1, Television o2) {
		
		return o2.getType().compareTo(o1.getType());
	}

}
