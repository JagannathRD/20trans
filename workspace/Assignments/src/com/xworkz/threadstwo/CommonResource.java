package com.xworkz.threadstwo;

import java.util.ArrayList;
import java.util.Iterator;

public class CommonResource  {
	
	
	<T> void collectionPrints(ArrayList<T> arrayList){
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			T t = (T) iterator.next();
			System.out.println(t);
		}
	}
}
