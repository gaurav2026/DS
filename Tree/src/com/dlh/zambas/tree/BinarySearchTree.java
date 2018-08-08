package com.dlh.zambas.tree;

public class BinarySearchTree {

	public boolean isBST(Node node) {
		return isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);

	}

	private boolean isBST(Node node, int min, int max) {
		if (null == node) {
			return true;
		}
		if (node.data <= min || node.data >= max) {
			return false;
		} else {
			return (isBST(node.left, min, node.data) && isBST(node.right, node.data, max));
		}

	}

	private static int findLargest(Node node) {
		if (null != node.right) {
			return findLargest(node.right);
		}

		return node.data;
	}

	public static int findSecondLargest(Node node) {
		if (null == node || (null == node.left && null == node.right)) {
			throw new IllegalArgumentException("There must be at least 2 nodes");
		}

		/**
		 * we are at largest second largest must be in left subtree
		 */
		if (null != node.left && null == node.right) {
			return findLargest(node.left);
		}

		// case: we're at parent of largest, and largest has no left subtree,
		// so 2nd largest must be current node
		if (null != node.right && null == node.right.left && null == node.right.left) {
			return node.data;
		}

		// otherwise check right
		return findSecondLargest(node.right);
	}
}
