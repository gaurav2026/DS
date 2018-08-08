package com.dlh.zambas.test;

import java.util.Stack;

public class InorderTraversalWithoutRecursion {

	public void inOrderTraversalWithoutRecursion(Node node) {
		Stack<Node> stack = new Stack<Node>();
		if (null == node)
			throw new IllegalArgumentException();

		while (null != node) {
			stack.push(node);
			node = node.left;
		}

		while (!stack.isEmpty()) {
			Node temp = stack.pop();
			System.out.print(temp.data + " ");
			if (null != temp.right) {
				temp = temp.right;
				while (null != temp) {
					stack.push(temp);
					temp = temp.left;
				}

			}
		}

	}
}
