package com.dlh.zambas.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ZigZagTraversal {

	public void zigZagTraversal(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);

		int count = 0;

		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.print(tempNode.data + "   ");

			if (count % 2 == 0) {
				if (null != tempNode.left)
					queue.add(tempNode.left);
				if (null != tempNode.right)
					queue.add(tempNode.right);
			} else {
				if (null != tempNode.right)
					queue.add(tempNode.right);
				if (null != tempNode.left)
					queue.add(tempNode.left);
			}

		}
	}
}
