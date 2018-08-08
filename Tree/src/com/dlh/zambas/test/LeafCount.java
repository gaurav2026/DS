package com.dlh.zambas.test;

public class LeafCount {

	private int count = 0;

	public int leafCount(Node node) {
		if (null == node)
			return 0;

		if (null == node.left && null == node.right) {
			count++;
		}
		
		else{
			leafCount(node.left);
			leafCount(node.right);
		}
		
		return count;
	}
}
