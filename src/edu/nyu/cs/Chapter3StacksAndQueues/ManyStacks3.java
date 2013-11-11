package edu.nyu.cs.Chapter3StacksAndQueues;

import java.util.ArrayList;
import java.util.Stack;

public class ManyStacks3<E> {

	ArrayList<Stack<E>> stacks;
	int max = 5;
	public ManyStacks3(){

	}
	
	public E pop(){
		int i = stacks.size() - 1;
		while(i >= 0){
			Stack<E> s = stacks.get(i);
			if (s.isEmpty()) {
				stacks.remove(s);
				i--;
			} else {
				return s.pop();
			}
		}
		return null;
	}
	
	public E push(E object){
		int last = stacks.size() - 1;
		if (last < 0 || (stacks.get(last).size() >= 5 )) {
			Stack<E> s = new Stack<E>();
			s.push(object);
			stacks.add(s);
		} else {
			stacks.get(last).push(object);
		}
		return object;
	}
	
	public E popAt(int index){
		if (index >= stacks.size()) {
			return null;
		} else {
			Stack<E> s = stacks.get(index);
			if (s.size() == 0){
				return null;
			} else {
				return s.pop();
			}
		}
	}
}
