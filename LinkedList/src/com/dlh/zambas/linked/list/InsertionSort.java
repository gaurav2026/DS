package com.dlh.zambas.linked.list;

public class InsertionSort {

	public void insertionSort(Node node) {
		if(null!=node && null!=node.getNext()){
			throw new IllegalArgumentException("List must have at least 2 elements");
		}
		Node currentNode = node.getNext();
		Node previousNode = node;
		while (null != currentNode) {
			Node temp = previousNode;
			int key = currentNode.getData();
			while(null!=temp && temp.getData()>key){
				if(temp.getData() > currentNode.getData()){
					currentNode.setData(temp.getData());
				}
			}
		}
	}
}
