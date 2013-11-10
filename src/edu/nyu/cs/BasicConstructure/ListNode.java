package edu.nyu.cs.BasicConstructure;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode (int val){
		this.val = val;
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append(val+" -> ");
		ListNode tmp = next;
		while(tmp != null){
			s.append(tmp.val + " -> ");
			tmp = tmp.next;
		}
		return s.toString();
		
	}
}
