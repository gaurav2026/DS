package com.dlh.zambas.tree;

public class LeafCount {

	public int getLeafCount(Node node){
		if(null==node){
			return 0;
		}
		if(null==node.left && null==node.right){
			return 1;
		}
		
		return getLeafCount(node.left) + getLeafCount(node.right);
	}
}
