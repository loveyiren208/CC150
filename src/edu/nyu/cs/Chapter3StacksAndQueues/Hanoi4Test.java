package edu.nyu.cs.Chapter3StacksAndQueues;

import static org.junit.Assert.*;

import org.junit.Test;

public class Hanoi4Test {

	@Test
	public void test() {
		Hanoi4 h = new Hanoi4(4);
		h.play();
	}

}
