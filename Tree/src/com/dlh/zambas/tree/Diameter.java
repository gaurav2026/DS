package com.dlh.zambas.tree;

public class Diameter {

	public int diameter(Node node){
		if(null==node)
			return 0;
		
		int lh = height(node.left);
		int rh = height(node.right);
		
		int lDiameter = diameter(node.left);
		int rDiameter = diameter(node.right);
		
		return Math.max(lh+rh+1, Math.max(lDiameter, rDiameter));
	}
	
	private int height(Node node){
		if(null==node)
			return 0;
		
		int lh = height(node.left);
		int rh = height(node.right);
		
		return Math.max(lh+1, rh+1);
	}
}
