package edu.nyu.cs.Chapter3StacksAndQueues;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class SortStack6Test {

	@Test
	public void test() {
		SortStack6 s = new SortStack6();
		Stack<Integer> old = new Stack<Integer>();
		old.push(3);
		old.push(4);
		old.push(1);
		old.push(9);
		old.push(22);
		old.push(3);
		
		System.out.println(s.sort(old));
	}

}
