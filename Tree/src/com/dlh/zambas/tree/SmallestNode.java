package com.dlh.zambas.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SmallestNode implements Iterable<Integer>{

	Queue<Node> queue = new LinkedList<Node>();
	
	public void smallestNode(Node node){
		if(null==node)
			return;
		
		smallestNode(node.left);
		queue.add(node);
		smallestNode(node.right);
	}
	
	public Queue<Node> returnSmallest(){
		return queue;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new ItemIterator((Node) queue.poll());
	}

	
	
}
