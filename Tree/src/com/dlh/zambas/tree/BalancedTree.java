package com.dlh.zambas.tree;

public class BalancedTree {
	
	public boolean isBalanced(Node node){
		if(null == node){
			return true;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		
		if ( (Math.abs(lh-rh)<=1) && isBalanced(node.left) && isBalanced(node.right)){
			return true;
		}
		return false;
		
	}
	
	private int height(Node node){
		if(null == node)
			return 0;
		
		int lh = height(node.left);
		int rh = height(node.right);
		
		return lh>rh ? lh+1:rh+1;
	}
	

}
