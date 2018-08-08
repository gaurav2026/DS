package com.dlh.zambas.lru.test;

import java.util.HashMap;

public class LRUCache {

	private HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	private Node head = null;
	private Node end = null;
	private int capacity;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public int get(Node n) {
		if (map.containsKey(n.key)) {
			delete(n);
			setHead(n);
			return n.value;
		}
		return -1;
	}

	private void setHead(Node n) {
		if(null == head){
			head = n.next;
			end = null;
		}
		else{
			head.prev = n.next;
			n.prev = null;
			head = n;
		}
	}
	

	private void delete(Node n) {
		if(n == head){
			head = n.next;
		}
		
		if(null == n.next){
			n.prev.next = null;
		}
		
		if(null!=n.next){
			n.prev.next = n.next;
		}
	}
	
	public void add(int key, int value){
		if(map.containsKey(key)){
			Node n = map.get(key);
			delete(n);
			setHead(n);
		}else{
			Node n = new Node(key, value);
			if(map.size()>=capacity){
				map.remove(end.key);
				setHead(n);
			}else{
				setHead(n);
			}
			map.put(key, n);
		}
	}
}
