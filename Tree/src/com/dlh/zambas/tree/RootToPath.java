package com.dlh.zambas.tree;

public class RootToPath {

	public boolean isRootToPathEqualToSum(Node node, int sum) {
		if (null == node) {
			return (sum == 0);
		}
		if (null == node.left && null == node.right) {
			return (sum == node.data);
		}
		System.out.print(node.data+ " ");
		sum = sum - node.data;
		if (null != node.left && isRootToPathEqualToSum(node.left, sum)) {
			return true;
		}
		if (null != node.right && isRootToPathEqualToSum(node.right, sum)) {
			return true;
		}
		return false;
	}
}
