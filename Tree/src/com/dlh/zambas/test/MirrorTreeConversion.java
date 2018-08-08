package com.dlh.zambas.test;

public class MirrorTreeConversion {

	public Node mirror(Node node){
		if(null == node)
			return null;
		
		Node left = mirror(node.left);
		Node right = mirror(node.right);
		
		node.left = right;
		node.right = left;
		
		return node;
	}
	
	public void inOrder(Node node){
		if(null==node)
			return;
		inOrder(node.left);
		System.out.print(node.data+ " ");
		inOrder(node.right);
		
	}
}
