package com.dlh.zambas.lru;

import java.util.HashMap;

public class LRUCache {

	int capacity;
	HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	Node head = null;
	Node end = null;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			Node n = map.get(key);
			remove(n);
			setHead(n);
			return n.value;
		}

		return -1;
	}

	public void setHead(Node n) {
		n.next = head;
		n.prev = null;

		if (null != head) {
			head.prev = n;
		}

		head = n;

		if (null == end)
			end = head;
	}

	public void remove(Node n) {                
		if(n.prev!=null){
			n.prev.next = n.next;
		}else{
			head = n.next;
		}
		
		if(n.next!=null){
			n.next.prev = n.prev;
		}else{
			end = n.prev;
		}
	}
	
	 public void set(int key, int value) {
	        if(map.containsKey(key)){
	            Node old = map.get(key);
	            old.value = value;
	            remove(old);
	            setHead(old);
	        }else{
	            Node created = new Node(key, value);
	            if(map.size()>=capacity){
	                map.remove(end.key);
	                remove(end);
	                setHead(created);
	 
	            }else{
	                setHead(created);
	            }    
	 
	            map.put(key, created);
	        }
	    }
}
