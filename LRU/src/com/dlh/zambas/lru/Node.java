package com.dlh.zambas.lru;

public class Node {

	Node prev = null;
	Node next = null;
	int key;
	int value;
	
	public Node(int key,int value){
		this.key = key;
		this.value = value;
	}
}
