package com.xworkz.queue;

import java.util.PriorityQueue;

public class PriorityQueueEaxmple {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		
		pq.add(40);
		pq.add(10);
		System.out.println(pq);
		pq.add(50);
		pq.add(30);
		pq.add(20);
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq);
	}

}
