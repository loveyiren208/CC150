package edu.nyu.cs.Chapter2LinkedList;

import edu.nyu.cs.BasicConstructure.ListNode;

public class PartitionLinkedList4 {
	/**
	 * kill me!! the pointer makes me crazy
	 * @param n
	 * @param x
	 * @return
	 */
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
	
	/**
	 * easy to understand
	 * 
	 * @param head
	 * @param x
	 * @return
	 */
	public ListNode partitionAnotherWay(ListNode head, int x) {
        ListNode smaller = new ListNode(0);
        smaller.next = head;
        ListNode larger = new ListNode(0);
        ListNode lHead = larger;
        ListNode sHead = smaller;
        while ( smaller != null && smaller.next != null) {
            if(smaller.next.val < x){
                smaller = smaller.next;
            } else {
                larger.next = smaller.next;
                smaller.next = smaller.next.next;
                larger = larger.next;
                larger.next = null;
            }
        }
        smaller.next = lHead.next;
        return sHead.next;
    }
}
