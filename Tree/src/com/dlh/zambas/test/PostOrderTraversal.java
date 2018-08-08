package com.dlh.zambas.test;

import java.util.Stack;

public class PostOrderTraversal {

	public void postOrderTraversal(Node node) {
		if (null == node)
			return;
		postOrderTraversal(node.right);
		postOrderTraversal(node.left);
		System.out.print(node.data + " ");
	}

	public void postOrderTraversalWithoutRecursion(Node node) {
		if (null == node) {
			return;
		}

		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();

		stack1.push(node);

		while (!stack1.isEmpty()) {
			Node temp = stack1.pop();
			stack2.push(temp);

			if (null != temp.right) {
				stack1.push(temp.right);
			}

			if (null != temp.left) {
				stack1.push(temp.left);
			}
		}

		while (!stack2.isEmpty()) {
			Node temp = stack2.pop();
			System.out.print(temp.data + " ");
		}
	}

}
