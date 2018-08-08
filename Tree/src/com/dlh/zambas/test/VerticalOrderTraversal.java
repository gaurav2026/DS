package com.dlh.zambas.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class VerticalOrderTraversal {
	public static List<List<Integer>> verticalOrder(Node root) {
		List<List<Integer>> res = new ArrayList<>();
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

		int minlevel = 0;
		int maxlevel = 0;

		Queue<Node> queue = new LinkedList<>();
		Queue<Integer> level = new LinkedList<>();

		queue.add(root);
		level.add(0);

		while (!queue.isEmpty()) {
			Node n = queue.poll();
			int l = level.poll();

			maxlevel = Math.max(maxlevel, l);
			minlevel = Math.min(minlevel, l);
			
			if(map.containsKey(l)){
				map.get(l).add(n.data);
			}else{
				ArrayList<Integer> list = new ArrayList<>();
				list.add(n.data);
				map.put(l, list);
			}
			
			if(n.left!=null){
				queue.add(n.left);
				level.add(l-1);
			}
			
			if(n.right!=null){
				queue.add(n.right);
				level.add(l+1);
			}

		}
		for(int i=minlevel;i<=maxlevel;i++){
			if(map.containsKey(i))
				res.add(map.get(i));
		}
		
		System.out.println(res);
		for(int i=0;i<res.size();i++){
			List<Integer> ar = res.get(i);
			System.out.println(ar.get(0));
		}
		return res;
	}

}
