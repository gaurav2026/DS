package com.dlh.zambas.test;

public class SecondLargest {

	public int findSecondLargestNode(Node node){
		if(null==node || (null==node.left && null==node.right)){
			throw new IllegalArgumentException("There can't be less than 2 nodes");
		}
		
		if(null!=node.left && null==node.right){
			findLargest(node.left);
		}
		
		if(null!=node.right && null==node.right.left && null==node.right.right){
			return node.data;
		}
		
		return findSecondLargestNode(node.right);
		
	}
	
	private int findLargest(Node node){
		if(null!=node.right){
			findLargest(node.right);
		}
		return node.data;
	}
}
