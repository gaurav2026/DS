package com.dlh.zambas.tree;

public class SecondLargestNode {
	

	public static int findSecondLargest(Node node) {
		if (null == node || (null == node.left && null == node.right)) {
			throw new IllegalArgumentException("There must be at least 2 nodes");
		}

		if (null != node.left && null == node.right) {
			return findLargest(node.left);
		}

		if (null != node.right && null == node.right.right && null != node.right.left) {
			return findLargest(node.right.left);
		}

		return findLargest(node.right);
	}

	private static int findLargest(Node node) {
		if (null != node.right) {
			return findLargest(node.right);
		}
		return node.data;
	}
}
