package com.dlh.zambas.test;

public class LCA {

	public static void findLCA(Node node, int n1, int n2) {
		while (null != node) {
			if (node.data < n1 && node.data < n2) {
				node = node.right;
			} else if (node.data > n1 && node.data > n2) {
				node = node.left;
			} else {
				break;
			}
		}
		
		System.out.println(node.data);
	}
}
