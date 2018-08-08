package com.dlh.zambas.tree;

public class Symmetry {

	public int isSymmetric(Node A) {
		boolean status = isSymmetric(A, A);
		if(status)
			return 1;
		else
			return 0;
	}

	public boolean isSymmetric(Node A, Node B) {
		if (null == A && null == B) {
			return true;
		}

		if (null != A && null != B && (A.data == B.data)) {
			return (isSymmetric(A.left,B.right) && isSymmetric(A.right, B.left));
		}

		return false;
	}

}