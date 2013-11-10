package edu.nyu.cs.Chapter2LinkedList;

import edu.nyu.cs.BasicConstructure.ListNode;

public class PartitionLinkedList4 {
	public ListNode partition(ListNode n, int x){
		ListNode head = new ListNode(-1);
		ListNode mark = head;
		head.next = n;
		ListNode part = head;
		while(head.next != null) {
			if (head.next.val >= x) {
				head = head.next;
			}else {
				ListNode tar = head.next;
				head.next = tar.next;
				tar.next = part.next;
				part.next = tar;
				part = part.next;
				head = tar;
			}
		}
		return mark.next;
	}
}
