package com.dlh.zambas.stack;

import java.util.Stack;

public class Max {
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> maxStack = new Stack<Integer>();
	
	public void push(int item){
		stack.push(item);
		if(maxStack.empty() || item>=maxStack.peek()){
			maxStack.push(item);
		}
	}
	
	public void pop(){
		int element = stack.pop();
		if(element==maxStack.peek()){
			maxStack.pop();
		}
	}
	
	public int getMax(){
		return maxStack.peek();
	}
	
	public static void main(String[] args) {
		Max m = new Max();
		m.push(3);
		m.push(4);
		m.push(1);
		m.push(5);
		m.push(2);
		m.push(10);
		
		m.pop();
		System.out.println(m.getMax());
		String s= "/aa";
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i)=='/');
		}
	}
}
