package com.dlh.zambas.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class HashMapImplementation {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new Key("vishal"), 20);
		map.put(new Key("sachin"), 30);
		map.put(new Key("vaibhav"), 40);

		System.out.println();
		System.out.println("Value for key sachin: " + map.get(new Key("sachin")));
		System.out.println("Value for key vaibhav: " + map.get(new Key("vaibhav")));
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(1);
		
		System.out.println(list);
	}
}
