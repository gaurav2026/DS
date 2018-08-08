package com.dlh.zambas.test;

import java.util.ArrayList;
import java.util.List;

public class RootToLeaf {

	public void rootToLeaf(Node node, ArrayList list) {
		if (null == node)
			return;
		list.add(node.data);
		if (null == node.left && null == node.right) {
			printPath(list);
		} else {
			rootToLeaf(node.left,new ArrayList<>(list));
			rootToLeaf(node.right,new ArrayList<>(list));
		}

	}

	public void printPath(List<Integer> list) {
		System.out.println();
		for (Integer n : list) {
			System.out.print(n + " ");
		}
		
	}
}
