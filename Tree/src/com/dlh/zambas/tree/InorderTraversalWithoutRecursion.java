package com.dlh.zambas.tree;

import java.util.Stack;

public class InorderTraversalWithoutRecursion {

	public void inorderTraversalWithoutRecursion(Node node) {
		if (null == node) {
			throw new IllegalArgumentException("Size must be more than zero");
		}

		Stack<Node> stack = new Stack<Node>();
		while (null != node) {
			stack.push(node);
			node = node.left;
		}

		while (stack.size() > 0) {
			node = stack.pop();
			System.out.print(node.data + " --> ");

			if (null != node.right) {
				node = node.right;

				while (null != node) {
					stack.push(node);
					node = node.left;
				}
			}
		}
	}
}
