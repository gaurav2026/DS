package com.dlh.zambas.test;

public class BalancedTree {

	public boolean isTreeBalanced(Node a) {
		if (null == a)
			return true;
		int lh = height(a.left);
		int rh = height(a.right);

		if ((Math.abs(lh - rh) <= 1) && isTreeBalanced(a.left) && isTreeBalanced(a.right))
			return true;
		
		return false;
	}

	private int height(Node a) {
		if (null == a)
			return 0;
		int lh = height(a.left);
		int rh = height(a.right);

		return lh > rh ? lh + 1 : rh + 1;

	}

}
