package edu.nyu.cs.Chapter3StacksAndQueues;

import java.util.Stack;

public class MinStack2 extends Stack<Integer>{
	Stack<Integer> minStack;
	public MinStack2(){
		this.minStack = new Stack<Integer>();
	}
	
	public Integer pop(){
		int num = super.pop();
		if (num == minStack.peek()) {
			minStack.pop();
		}
		return num;
	}
	
	public Integer push(Integer num){
		super.push(num);
		if (num <= minStack.peek()){
			minStack.push(num);
		}
		return num;
	}
	
	public Integer min(){
		return minStack.peek();
	}
}
