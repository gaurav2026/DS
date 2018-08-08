package com.dlh.zambas.tree;

public class LeftView {
	int maxLevel = 0;

	public void leftView(Node node, int level) {
		if (null == node) {
			return;
		}
		if (maxLevel < level) {
			System.out.println(node.data);
			maxLevel = level;
		}

		leftView(node.left, level + 1);
		leftView(node.right, level + 1);
	}

	public void levelOrderTraversal(Node node) {
		int height = findHeight(node);
		for (int i = 1; i <= height; i++) {
			printLevelOrder(node, i, i);
		}
	}

	private void printLevelOrder(Node node, int level, int value) {
		if (node == null)
			return;
		if (level == 1)
			System.out.print(node.data + " ");
		else if (level > 1 && value % 2 == 0) {
			printLevelOrder(node.left, level - 1, value);
			printLevelOrder(node.right, level - 1, value);
		}
		else if (level > 1 && value % 2 != 0) {
			printLevelOrder(node.right, level - 1, value);
			printLevelOrder(node.left, level - 1, value);
		}
	}

	private int findHeight(Node node) {
		if (null == node) {
			return 0;
		}
		int lHeight = findHeight(node.left);
		int rHeight = findHeight(node.right);
		return lHeight > rHeight ? lHeight + 1 : rHeight + 1;
	}

}
