package com.dlh.zambas.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalWithRecursion {
	List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	
	public void levelOrderTraversal(Node node) {
		
		int height = height(node);
		List<Integer> temp = new ArrayList<Integer>();
		System.out.println(height);
		for (int i = 1; i <= height; i++) {
			List<Integer> subList = new ArrayList<Integer>();
			subList = printLevelOrder(node, i, i,subList);
			list.add((ArrayList<Integer>) subList);
		}
		System.out.println(list);
	}

	private List<Integer> printLevelOrder(Node node, int level, int value, List<Integer> subList) {
		if (null == node) {
			return null;
		}

		if (level == 1) {
			System.out.print(node.data + " : ");
			subList.add(node.data);
		} else if (level > 1 && value % 2 == 0) {
			printLevelOrder(node.left, level - 1, value, subList);
			printLevelOrder(node.right, level - 1, value, subList);
		} else if (level > 1 && value % 2 != 0) {
			printLevelOrder(node.right, level - 1, value, subList);
			printLevelOrder(node.left, level - 1, value, subList);
		}
		return subList;
	}

	public int height(Node node) {
		if (null == node) {
			return 0;
		}
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		return leftHeight >= rightHeight ? leftHeight + 1 : rightHeight + 1;
	}
	
	public int heightWithoutRecursion(Node node) throws Exception{
		Queue<Node> queue =new LinkedList<Node>();
		if(node==null){
			return 0;
		}
		int height = 0;
		queue.add(node);
		queue.add(null);
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			if(null==temp){
				if(!queue.isEmpty()){
					queue.add(null);
				}
				height++;
			}else{
				if(null!=temp.left){
					queue.add(temp.left);
				}
				if(null!=temp.right){
					queue.add(temp.right);
				}
			}
		}
		return height;
	}

}
