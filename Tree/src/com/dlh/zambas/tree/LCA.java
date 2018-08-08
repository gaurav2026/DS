package com.dlh.zambas.tree;

public class LCA {

	static boolean v1 = false;
	static boolean v2 = false;

	private Node findLCAUtil(Node node, int n1, int n2) {
		if (null == node)
			return null;
		

		if (node.data == n1) {
			v1 = true;
			return node;
		}

		if (node.data == n2) {
			v2 = true;
			return node;
		}
		Node left_lca = findLCAUtil(node.left, n1, n2);
		Node right_lca = findLCAUtil(node.right, n1, n2);
		
		if (null != left_lca && null != right_lca) {
			return node;
		}
		
		return (left_lca != null) ? left_lca : right_lca;
	}

	private boolean find(Node node, int k) {
		if (null == node)
			return false;
		if (node.data == k || find(node.left, k) || find(node.right, k))
			return true;
		return false;
	}

	public Node findLCA(Node node, int n1, int n2) {
		if (null == node)
			return null;

		Node lca = findLCAUtil(node, n1, n2);
		if ((v1 && v2) || (v1 && find(lca, n2)) || (v2 && find(lca, n1))) {
			return lca;
		}
		return null;
	}
}
