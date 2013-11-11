package edu.nyu.cs.Chapter2LinkedList;

import edu.nyu.cs.BasicConstructure.ListNode;

public class AddTwoNumbers5 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode result = new ListNode(0);
		ListNode head = result;
		while (l1 != null || l2 != null) {
			int r = 0;
			if (l1 == null) {
				r = carry + l2.val;
				l2 = l2.next;
			} else if (l2 == null) {
				r = carry + l1.val;
				l1 = l1.next;
			} else {
				r = carry + l1.val + l2.val;
				l1 = l1.next;
				l2 = l2.next;
			}
			if (r < 10) {
				carry = 0;
			} else {
				carry = 1;
			}
			result.next = new ListNode(r % 10);
			result = result.next;
		}
		if (carry == 1) {
			result.next = new ListNode(1);
		}
		return head.next;
	}
}
