package com.dlh.zambas.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

	public void inOrderTraversal(Node node) {
		if (null == node) {
			return;
		}
		inOrderTraversal(node.left);
		System.out.print(node.data + " --> ");
		inOrderTraversal(node.right);
	}

	public void descendingOrder(Node node) {
		if (null == node) {
			return;
		}
		descendingOrder(node.right);
		System.out.print(node.data + " --> ");
		descendingOrder(node.left);
	}

	public void median(Node node) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();
		while (null != node) {
			stack.push(node);
			node = node.left;
		}

		while (!stack.isEmpty()) {
			Node temp = stack.pop();
			list.add(temp.data);

			if (null != temp.right) {
				temp = temp.right;
				while (null != temp) {
					stack.push(temp);
					temp = temp.left;
				}
			}
		}
		System.out.println(list);
		if (list.size() % 2 != 0) {
			System.out.println("median " + list.get(list.size() / 2));
		} else {
			int mid = list.size()/2;
			int a = list.get(mid);
			int b = list.get(mid-1);
			System.out.println("median " + (a+b)/2);
		}
	}
}
