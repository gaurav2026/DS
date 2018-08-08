package com.dlh.zambas.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalWithoutRecursion {

	public void levelOrderTraversal(Node node){
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		
		while(!queue.isEmpty()){
			Node tempNode = queue.poll();
			
			System.out.print(tempNode.data + " : ");
			
			if(null!=tempNode.left){
				queue.add(tempNode.left);
			}
			
			if(null!=tempNode.right){
				queue.add(tempNode.right);
			}
		}
	}
}
