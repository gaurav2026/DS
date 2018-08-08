package com.dlh.zambas.tree;

import java.util.LinkedList;
import java.util.Queue;
	
public class Solution {
	Queue<Integer> queue = new LinkedList<Integer>();

	public Solution(Node root) {
		inOrderTraversal(root);
	}

	private void inOrderTraversal(Node node) {
		if (null == node) {
			return;
		}
		inOrderTraversal(node.left);
		queue.add(node.data);
		inOrderTraversal(node.right);
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !queue.isEmpty();
	}

	/** @return the next smallest number */
	public int next() {
		return queue.poll();
	}
}
