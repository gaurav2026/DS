package com.dlh.zambas.test;

import java.util.ArrayList;

public class MaxSumPath {

	private int maxSum = Integer.MIN_VALUE;

	public void findMaxSumPath(Node node, ArrayList<Node> list) {
		if (null == node) {
			return;
		}
		list.add(node);
		if (null == node.left && null == node.right) {
			checkSum(list);
		} else {
			findMaxSumPath(node.left, new ArrayList<Node>(list));
			findMaxSumPath(node.right, new ArrayList<Node>(list));
		}

	}

	private void checkSum(ArrayList<Node> list) {
		int sum = 0;
		for (Node n : list) {
			sum += n.data;
		}

		if (sum > maxSum) {
			maxSum = sum;
		}
	}

	public int getMaxSum() {
		return maxSum;
	}

}
