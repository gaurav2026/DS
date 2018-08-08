package com.dlh.zambas.test;

import java.util.ArrayList;
import java.util.List;

public class RootToPathEqualToSum {

	private List<Node> list = new ArrayList<Node>();
	private List<Boolean> status = new ArrayList<Boolean>();

	public boolean isRootToPathEqualToSum(Node node, List<Node> list, int x) {
		if (null == node)
			return true;

		list.add(node);
		if (null == node.left && null == node.right) {
			status.add(checkSum(list, x));
		} else {
			isRootToPathEqualToSum(node.left, new ArrayList<Node>(list), x);
			isRootToPathEqualToSum(node.right, new ArrayList<Node>(list), x);
		}
		return false;
	}

	private boolean checkSum(List<Node> list, int x) {
		int sum = 0;
		for (Node l : list) {
			sum += l.data;
			if (sum == x)
				return true;
		}
		return false;
	}

	public boolean returnStatus() {
		if (status.contains(true))
			return true;
		else
			return false;
	}

	public void isRootToPathEqualToSum(Node node, int x) {
		isRootToPathEqualToSum(node,list,x);
	}

}
