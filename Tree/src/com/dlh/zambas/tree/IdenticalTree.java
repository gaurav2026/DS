package com.dlh.zambas.tree;

import java.util.Stack;

public class IdenticalTree {
	public int isSameTree(Node A, Node B) {
		Stack<Node> stackA = new Stack<Node>();
		Stack<Node> stackB = new Stack<Node>();

		while (null != A) {
			stackA.push(A);
			A = A.left;
		}

		while (null != B) {
			stackB.push(B);
			B = B.left;
		}

		while (stackA.size() > 0 && stackB.size() > 0) {
			A = stackA.pop();
			B = stackB.pop();
			if (A.data != B.data) {
				return 0;
			}
			if (null != A.right && null != B.right) {
				A = A.right;
				B = B.right;
				while (null != A && null != B) {
					stackA.push(A);
					stackB.push(B);
					A = A.left;
					B = B.left;
				}
			}
		}

		if (stackA.size()!=stackB.size()) {
			return 0;
		}
		return 1;
	}

}
