package edu.nyu.cs.Chapter3StacksAndQueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTwoStack5Test {

	@Test
	public void test() {
		MyQueueTwoStack5<Integer> m = new MyQueueTwoStack5<Integer>();
		m.add(2);
		m.add(3);
		
		assertTrue(m.poll() == 2);
		m.add(4);
		assertTrue(m.poll() == 3);
		m.add(5);
		assertTrue(m.peek() == 4);
		m.add(6);
		assertTrue(m.poll() == 4);
		assertTrue(m.poll() == 5);
		assertTrue(m.poll() == 6);
		assertTrue(m.poll() == null);
		m.add(7);

		
	}

}
