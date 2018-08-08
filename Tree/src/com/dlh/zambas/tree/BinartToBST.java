package com.dlh.zambas.tree;

import java.util.ArrayList;
import java.util.List;

public class BinartToBST {

	private int count = 0;
	private List<Integer> list = new ArrayList<Integer>();

	public void inorder(Node node) {
		if (null == node)
			return;
		inorder(node.left);
		list.add(node.data);
		inorder(node.right);
	}

	public List<Integer> getList() {
		return list;
	}

	public Node binaryToBST(Node node, List<Integer> list) {
		if (null == node)
			return null;
		binaryToBST(node.left, list);
		node.data = list.get(count++);
		binaryToBST(node.right, list);

		return node;

	}

}
