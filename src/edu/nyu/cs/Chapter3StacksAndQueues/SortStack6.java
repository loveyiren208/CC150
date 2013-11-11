package edu.nyu.cs.Chapter3StacksAndQueues;

import java.util.Stack;

public class SortStack6 {
	
	
	public Stack<Integer> sort(Stack<Integer> old){
		Stack<Integer> result = new Stack<Integer>();
		Stack<Integer> helper = new Stack<Integer>();
		
		while(!old.isEmpty()){
			int num = old.pop();
			if(result.isEmpty() || num <= result.peek()){
				result.add(num);
			} else {
				while(!result.isEmpty()){
					if (result.peek() < num){
						helper.push(result.pop());
					}else {
						break;
					}
				}
				result.push(num);
				while ( !helper.isEmpty()){
					result.push(helper.pop());
				}
			}
		}
 		return result;
	}
}
