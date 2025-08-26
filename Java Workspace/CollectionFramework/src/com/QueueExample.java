package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LinkeList Queue 
		
		Queue q1 = new LinkedList();
		q1.add(3);q1.add(1);q1.add(7);q1.add(5);q1.add(9);
		
		System.out.println(q1);
		System.out.println("remove element "+q1.poll());
		System.out.println(q1);
		System.out.println("------------------");
		Queue q2 = new PriorityQueue();
		q2.add(3);q2.add(1);q2.add(7);q2.add(5);q2.add(9);
		System.out.println(q2);
		System.out.println("remove element "+q2.poll());
		System.out.println(q2);
	}

}
