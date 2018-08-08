package com.dlh.zambas.tree;

public class CountSubTrees {

	public int countSubTreesEqualToX(Node root, int x) {
		int count = 0;
		if (null == root) {
			return 0;
		}

		int leftSubTree = subTreeSum(root.left, x);
		int rightSubTree = subTreeSum(root.right, x);

		if (leftSubTree + rightSubTree + root.data == x) {
			count++;
		}
		return count;

	}

	private int subTreeSum(Node node, int x) {
		if (null == node) {
			return 0;
		}

		int leftSubTree = subTreeSum(node.left, x);
		int rightSubTree = subTreeSum(node.right, x);

		return leftSubTree + rightSubTree + node.data;

	}
}
