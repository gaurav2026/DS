package com.dlh.zambas.test;

import java.util.LinkedList;
import java.util.Queue;

public class LeftView {

	private int index = 0;

	public void leftView(Node node) {
		int height = height(node);
		for (int i = 0; i < height; i++) {
			index = 0;
			leftView(node,i);
		}
	}

	public void levelOrderTraversalWithoutRecursion(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);

		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.print(temp.data + " ");

			if (null != temp.left)
				queue.add(temp.left);

			if (null != temp.right)
				queue.add(temp.right);
		}
	}

	private void leftView(Node node, int level) {
		if (null == node)
			return;
		if (level == 0 && index == 0) {
			System.out.print(node.data + " ");
			index++;
		} else {
			leftView(node.left, level - 1);
			leftView(node.right, level - 1);
		}
	}

	private int height(Node node) {
		if (null == node)
			return 0;
		int lh = height(node.left);
		int rh = height(node.right);

		return lh > rh ? lh + 1 : rh + 1;
	}

	public void leftViewIterative(Node node){
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			System.out.print(temp.data+" ");
			
			if(null!=temp.left)
				queue.add(temp.left);
			else if(null!=temp.right)
				queue.add(temp.right);
		}
	}
}
