package com.dlh.zambas.test;

public class LCABinaryTree {
	static boolean v1 = false;
	static boolean v2 = false;
	
	private Node findLCAUtil(Node node, int n1, int n2){
		if(null==node)
			return null;
		
		if(node.data==n1){
			v1= true;
			return node;
		}
		
		if(node.data==n2){
			v2 = true;
			return node;
		}
		
		Node lca_left = findLCAUtil(node.left, n1, n2);
		Node lca_right = findLCAUtil(node.right, n1, n2);
		
		if(null!=lca_left && null!=lca_right){
			return node;
		}
		
		return (null!=lca_left)?lca_left:lca_right;
	}
	
	private boolean find(Node node, int k){
		if(null==node)
			return false;
		if((node.data==k) || find(node.left, k) || find(node.right, k)){
			return true;
		}
		return false;
	}
	
	public Node findLCA(Node node, int n1,int n2){
		if(null==node)
			return null;
		Node lca = findLCAUtil(node, n1, n2);
		if((v1&&v2) || (v1 && find(node.left, n2)) || (v2 && find(node.right, n1))){
			return lca;
		}
		return null;
	}
}
