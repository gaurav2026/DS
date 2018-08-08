package com.dlh.zambas.test;

public class CountSubtreeToASum {
	static int count = 0;
	public int countSubTreeToASum(Node node, int x) {
		if (null == node)
			return 0;
		
		int lSum = sum(node.left,x);
		int rSum = sum(node.right,x);

		if ((lSum + rSum + node.data) == x)
			count++;
		
		return count;

	}

	private int sum(Node node, int x) {
		if (null == node)
			return 0;

		int lSum = sum(node.left,x);
		int rSum = sum(node.right,x);

		int sum = lSum + rSum + node.data;
		
		if(sum==x)
			count++;
		return sum;

	}
}
