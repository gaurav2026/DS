package com.dlh.zambas.test;

public class IdenticalTree {

	public boolean isTreeIdentical(Node a, Node b) {
		if (null == a && null == b)
			return true;

		if ((null == a && null != b) || (null != a && null == b))
			return false;

		return ((a.data == b.data) && isTreeIdentical(a.left, b.left) && isTreeIdentical(a.right, b.right));

	}
}
