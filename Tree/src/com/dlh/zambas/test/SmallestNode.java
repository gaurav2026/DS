package com.dlh.zambas.test;

public class SmallestNode {

	public int findSmallestNode(Node node) {
		if (null == node || (null == node.left && null == node.right)) {
			throw new IllegalArgumentException("Size can't be less than two");
		}

		while (null != node.left) {
			node = node.left;
		}

		return node.data;

	}

}
