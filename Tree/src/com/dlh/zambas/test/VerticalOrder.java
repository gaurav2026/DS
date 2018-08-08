package com.dlh.zambas.test;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class VerticalOrder {

	static void getVerticalOrder(Node root, int hd, TreeMap<Integer, ArrayList<Integer>> m) {
		// Base case
		if (root == null)
			return;

		// get the vector list at 'hd'
		ArrayList<Integer> get = m.get(hd);

		// Store current node in map 'm'
		if (get == null) {
			get = new ArrayList<>();
			get.add(root.data);
		} else
			get.add(root.data);

		m.put(hd, get);

		// Store nodes in left subtree
		getVerticalOrder(root.left, hd - 1, m);
		
		// Store nodes in right subtree
		getVerticalOrder(root.right, hd + 1, m);
	}

	// The main function to print vertical oder of a binary tree
	// with given root
	static void printVerticalOrder(Node root) {
		// Create a map and store vertical oder in map using
		// function getVerticalOrder()
		TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
		int hd = 0;
		getVerticalOrder(root, hd, m);

		// Traverse the map and print nodes at every horigontal
		// distance (hd)
		for (Entry<Integer, ArrayList<Integer>> entry : m.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
}
