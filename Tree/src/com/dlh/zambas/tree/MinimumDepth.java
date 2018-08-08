package com.dlh.zambas.tree;

public class MinimumDepth {

	public static int minDepth(Node node) {
		if (null == node) {
			return 0;
		}

		if (null == node.left && null == node.right) {
			return 1;
		}
		if (null == node.left) {
			return minDepth(node.right) + 1;
		}
		if (null == node.right) {
			return minDepth(node.left) + 1;
		}

		return Math.min(minDepth(node.left), minDepth(node.right)) + 1;

	}

}
