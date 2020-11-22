package com.xworkz.mountain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.Vector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.mountain.part.Festival;
import com.xworkz.mountain.part.Virus;

public class SpringTester {

	public static void main(String[] args) {
		System.out.println("Spring starts...");
		
		String configFileName="resource/context.xml";
		
		ApplicationContext spring= new ClassPathXmlApplicationContext(configFileName);
		Virus virus=spring.getBean(Virus.class);
		virus.spreadDiseases();
		
		String string=spring.getBean(String.class);
		System.out.println(string.isEmpty());
		
		Festival fesival=spring.getBean(Festival.class);
		fesival.celebration();

		Thread thread=spring.getBean(Thread.class);
		System.out.println(thread.getName());
		
		Array array=spring.getBean(Array.class);
		Method[] methods=array.getClass().getMethods();
		for (Method method : methods) {
			System.out.println("Array method "+method.getName());
		}
		
		ArrayList arrayList=spring.getBean(ArrayList.class);
		
		Method[] field=arrayList.getClass().getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		HashSet hashSet=spring.getBean(HashSet.class);
		Method[] Methods=hashSet.getClass().getMethods();
		for (Method Method : Methods) {
			System.out.println("HashSet Methods "+Method.getName());
		}
		
		PriorityQueue queue=spring.getBean(PriorityQueue.class);
		Method[] methods2=queue.getClass().getMethods();
		for (Method method : methods2) {
			System.out.println("queue "+method.getName());
		}
		
		HashMap hashMap=spring.getBean(HashMap.class);
		Method[] methods3=hashMap.getClass().getMethods();
		for (Method method : methods3) {
			System.out.println("hashMap "+method.getName());
		}
		
		Vector vector=spring.getBean(Vector.class);
		Method[] methods4=vector.getClass().getMethods();
		for (Method method : methods4) {
			System.out.println("vector "+method.getName());
		}
		
		IOException iOException=spring.getBean(IOException.class);
		Method[] methods5=iOException.getClass().getMethods();
		for (Method method : methods5) {
			System.out.println("IOException "+method.getName());
		}
		
		TreeMap treeMap=spring.getBean(TreeMap.class);
		Method[] methods6=treeMap.getClass().getMethods();
		for (Method method : methods6) {
			System.out.println("treeMap "+ method.getName());
		}
		
		ArithmeticException ae=spring.getBean(ArithmeticException.class);
		Method[] methods7=ae.getClass().getMethods();
		for (Method method : methods7) {
			System.out.println("ae "+ method.getName());
		}
	}

}
