package com.dlh.zambas.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

	public void preOrderTraversal(Node node){
		if(null==node){
			return;
		}
		System.out.print(node.data + " --> ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
	
	public void preOrderWithoutRecursion(Node A){
		  List<Integer> list = new ArrayList<Integer>();
	        if(null==A){
	            return;
	        }
	        Stack<Node> stack = new Stack<Node>();
	        stack.push(A);
	        
	        while(!stack.isEmpty()){
	            Node temp = stack.peek();
	            list.add(temp.data);
	            
	            stack.pop();
	            
	            if(null!=temp.right){
	                stack.push(temp.right);
	            }
	            
	            if(null!=temp.left){
	                stack.push(temp.left);
	            }
	        }
	        System.out.println(list);
	        int[] arrayToBeReturned = new int[list.size()];
	        for(int i=0;i<list.size();i++){
	            arrayToBeReturned[i] = list.get(i);
	        }
	        System.out.println();
	        for(int i=0;i<arrayToBeReturned.length;i++){
	        	System.out.print(arrayToBeReturned[i]);
	        }
	}
}
