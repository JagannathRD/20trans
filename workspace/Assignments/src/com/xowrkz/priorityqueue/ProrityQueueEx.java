package com.xowrkz.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ProrityQueueEx {

	public static void main(String[] args) {
		System.out.println("mms");
		PriorityQueue<Double> pq = new PriorityQueue<>();
		pq.add(2.4);
		pq.offer(2.5);
		pq.add(2.6);
		pq.add(2.7);
		pq.offer(2.8);
		pq.add(2.0);
		pq.add(1.0);
		pq.offer(2.5);
		pq.add(2.6);

		Iterator<Double> itr = pq.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println("PEEK-Retrieves, but does not remove, the head of this queue " + pq.peek());

		System.out.println("POLL-Retrieves and removes the head of this queue" + pq.poll());
		System.out.println("Removes a single instance of the specified element from this queue,"
				+ "true if this queue changed as a result of the call "+pq.remove(2.4));
		System.out.println(pq);
		System.out.println("element-Retrieves, but does not remove, the head of this queue "+pq.element());
		System.out.println("mme");
	}

}
