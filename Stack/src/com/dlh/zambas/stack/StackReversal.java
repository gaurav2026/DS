package com.dlh.zambas.stack;

import java.util.Stack;

public class StackReversal {
	static Stack<Integer> s = new Stack<Integer>();

	public static void main(String[] args) {

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s);
		reverse(s);
		System.out.println(s);
	}

	private static void reverse(Stack<Integer> s) {
		if (!s.isEmpty()) {
			int t = s.pop();

			reverse(s);

			insertAtBottom(t);
		}
	}

	private static void insertAtBottom(int t) {
		if(s.isEmpty())
			s.push(t);
		else{
			int temp = s.pop();
			insertAtBottom(t);
			
			s.push(temp);
		}
	}
}
