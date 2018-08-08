package com.dlh.zambas.tree;

import java.util.Stack;

public class SwapElements {

	private Stack<Integer> stack = new Stack<Integer>();
	public static int height(Node node) {
		if (node == null)
			return 0;
		return 1 + Math.max(height(node.left), height(node.right));
	}

	public Stack<Integer> swapElements(Node node) {
		int height = height(node);
		for (int i = 1; i <= height; i++) {
			swapElementsToMakeTreeBalanced(node,i);
		}
		
		return stack;
	}

	private void swapElementsToMakeTreeBalanced(Node node,int level) {
		if(null==node)
			return;
		if(level==1){
			stack.push(node.data);
		}else{
			swapElementsToMakeTreeBalanced(node.left, level-1);
			swapElementsToMakeTreeBalanced(node.right, level-1);
		}
	}
}
