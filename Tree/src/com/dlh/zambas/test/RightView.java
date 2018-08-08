package com.dlh.zambas.test;

public class RightView {

	private int index = 0;

	public void rightView(Node node) {
		int height = height(node);
		for (int i = 0; i < height; i++) {
			index = 0;
			rightView(node, i);
		}
	}

	private void rightView(Node node, int level) {
		if (null == node)
			return;

		if (level == 0 && index == 0) {
			System.out.print(node.data + " ");
			index++;
		} else {
			rightView(node.right,level-1);
			rightView(node.left,level-1);
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
