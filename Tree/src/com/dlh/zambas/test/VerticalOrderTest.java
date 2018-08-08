package com.dlh.zambas.test;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class VerticalOrderTest {

	public static void printVerticalTraversal(Node node){
		Map<Integer,ArrayList<Integer>> map = new TreeMap<Integer,ArrayList<Integer>>();
		int horizontalDistance = 0;
		verticalOrderTraversal(node,horizontalDistance,map);
		
		for (Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	private static void verticalOrderTraversal(Node node, int horizontalDistance, Map<Integer, ArrayList<Integer>> map) {
		if(null==node)
			return;
		
		ArrayList<Integer> list = map.get(horizontalDistance);
		if(null==list){
			list = new ArrayList<Integer>();
			list.add(node.data);
		}else{
			list.add(node.data);
		}
		
		map.put(horizontalDistance, list);
		
		verticalOrderTraversal(node.left, horizontalDistance-1, map);
		verticalOrderTraversal(node.right, horizontalDistance+1, map);
	}
}
