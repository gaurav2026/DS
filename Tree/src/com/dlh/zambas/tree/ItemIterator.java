package com.dlh.zambas.tree;

import java.util.Iterator;
import java.util.Queue;

public class ItemIterator<Integer> implements Iterator<Object>{
	
	private Queue<Node> queue;
	private int position;
	
	public ItemIterator(Node node) {
		this.queue = (Queue<Node>) node;
	}

	@Override
	public boolean hasNext() {
		if(position<queue.size()){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Object next() {
		Object node = queue.poll();
		position++;
		return node;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
