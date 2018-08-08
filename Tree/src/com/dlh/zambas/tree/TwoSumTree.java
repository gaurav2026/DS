package com.dlh.zambas.tree;

import java.util.Stack;

public class TwoSumTree {
	Stack<Integer> inorderStack = new Stack<Integer>();
	Stack<Integer> reverseInorderStack = new Stack<Integer>();

	public int findTwoNodesEqualToASum(Node node, int sum) {
		int inOrderNumber = 0;
		int reverseInOrderNumber = 0;
		inorderTraversal(node);
		reverseInorderTraversal(node);
		while (!inorderStack.isEmpty() && !reverseInorderStack.isEmpty()) {
			if(inorderStack.peek() + reverseInorderStack.peek() == sum && inorderStack.peek()!=reverseInorderStack.peek()){
				return 1;
			}else if(inorderStack.peek() + reverseInorderStack.peek() > sum){
				reverseInOrderNumber = reverseInorderStack.pop();
			}else{
				inOrderNumber = inorderStack.pop();
			}
		}
		
	
		return 0;
	}

	private void reverseInorderTraversal(Node node) {
		if (null == node) {
			return;
		}
		reverseInorderTraversal(node.right);
		reverseInorderStack.push(node.data);
		reverseInorderTraversal(node.left);
	}

	private void inorderTraversal(Node node) {
		if (null == node) {
			return;
		}
		inorderTraversal(node.left);
		inorderStack.push(node.data);
		inorderTraversal(node.right);
	}
}
