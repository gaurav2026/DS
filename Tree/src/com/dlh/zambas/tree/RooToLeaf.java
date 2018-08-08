package com.dlh.zambas.tree;

public class RooToLeaf {

	public void rootToLeaf(Node node, int path[], int pathLen) {
		if (null == node) {
			return;
		}

		path[pathLen++] = node.data;
		if (null == node.left && null == node.right) {
			System.out.println();
			printPath(path, pathLen);
		} else {
			rootToLeaf(node.left, path, pathLen);
			rootToLeaf(node.right, path, pathLen);
		}
	}

	private void printPath(int[] path, int patheLen) {
		for (int i = 0; i < patheLen; i++) {
			System.out.print(path[i] + " : ");
		}

	}
}
