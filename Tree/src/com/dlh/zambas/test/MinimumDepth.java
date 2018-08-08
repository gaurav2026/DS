package com.dlh.zambas.test;

public class MinimumDepth {

	public int findMinDepth(Node node) {
		if (null == node)
			return 0;

		if (null == node.left && null == node.right) {
			return 1;
		}
		
		if(null==node.left){
			return findMinDepth(node.right)+1;
		}
		
		if(null==node.right){
			return findMinDepth(node.left)+1;
		}

		return Math.min(findMinDepth(node.left), findMinDepth(node.right)) + 1;

	}

}
