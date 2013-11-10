package edu.nyu.cs.Chapter2LinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.nyu.cs.BasicConstructure.ListNode;

public class PartitionLinkedList4Test {

	@Test
	public void test() {
		PartitionLinkedList4 p = new PartitionLinkedList4();
		ListNode a = new ListNode(0);
		a.next = new ListNode(4);
		a.next.next = new ListNode(1);
		a.next.next.next = new ListNode(3);
		a.next.next.next.next = new ListNode(2);
		System.out.println(p.partition(a, 2));
	}

}
