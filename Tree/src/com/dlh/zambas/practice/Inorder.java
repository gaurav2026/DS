package com.dlh.zambas.practice;

import java.util.Stack;

public class Inorder {
	
	public static void inOrderTraversal(Node node){
		if(null == node)
			return;
		
		Stack<Node> stack = new Stack<Node>();
		
		while(null!=node){
			stack.push(node);
			node = node.left;
		}
		
		while(!stack.isEmpty()){
			Node temp = stack.pop();
			System.out.print(temp.data+" ");
			
			if(null!=temp.right){
				temp = temp.right;
				while(null!=temp){
					stack.push(temp);
					temp = temp.left;
				}
			}
		}
	}
}
