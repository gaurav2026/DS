package com.dlh.zambas.tree;

import java.util.Stack;

public class PostOrderTraversal {

	public void postOrderTraversalWithRecusrion(Node node) {
		if (null == node) {
			return;
		}
		postOrderTraversalWithRecusrion(node.right);
		postOrderTraversalWithRecusrion(node.left);
		System.out.println(node.data);
	}

	public void postOrderTraversalWithoutRecursion(Node node) {
		if (null == node) {
			return;
		}

		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		
		stack1.push(node);
		
		while(!stack1.isEmpty()){
			Node temp = stack1.pop();
			stack2.push(temp);
			
			if(null!=node.left){
				stack1.push(temp.left);
			}
			
			if(null!=node.right){
				stack1.push(temp.right);
			}
		}
		
		while(!stack2.isEmpty()){
			System.out.print(stack2.pop().data+" ");
		}
	}
}
