package com.dlh.zambas.test;

public class ZigZagTraversal {

	public void zigZagTraversal(Node node) {
		if (null == node)
			throw new IllegalArgumentException("Tree can't be empty");
		int height = height(node);
		for (int i = 0; i < height; i++) {
			printZigZag(node, i, i);
		}
	}

	private void printZigZag(Node node, int level, int index) {
		if(null==node)
			return;
		
		if(level==0){
			System.out.print(node.data+" ");
		}
		
		if(index%2==0){
			printZigZag(node.right, level-1, index);
			printZigZag(node.left, level-1, index);
		}else{
			printZigZag(node.left, level-1, index);
			printZigZag(node.right, level-1, index);
		}
	}

	private int height(Node node) {
		if (null == node)
			return 0;
		int lh = height(node.left);
		int rh = height(node.right);
		return lh > rh ? lh + 1 : rh + 1;
	}

}
