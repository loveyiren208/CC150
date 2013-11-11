package edu.nyu.cs.Chapter3StacksAndQueues;

import java.util.Stack;

public class MyQueueTwoStack5<E> {
	Stack<E> s1;
	Stack<E> s2;
	public MyQueueTwoStack5(){
		s1 = new Stack<E>();
		s2 = new Stack<E>();
	}
	
	public E poll(){
		if (!s2.isEmpty()){
			return s2.pop();
		} else {
			move();
			if (!s2.isEmpty()){
				return s2.pop();
			}
		}
		return null;
	}
	
	public E add(E object){
		if (object != null) {
			s1.push(object);
		}
		return object;
	}
	
	public E peek(){
		if (!s2.isEmpty()){
			return s2.peek();
		} else {
			move();
			if (!s2.isEmpty()) {
				return s2.peek();
			}
		}
		return null;
	}
	
	public void move(){
		while (!s1.isEmpty()) {
			E object = s1.pop();
			s2.push(object);
		}
	}
}
