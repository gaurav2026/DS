package com.dlh.zambas.tree;

import java.util.Stack;

public class SerializationDeserialization {

	public String serialize(Node node) {
		StringBuilder sb = new StringBuilder();
		Stack<Node> stack = new Stack<Node>();
		stack.push(node);
		while (!stack.isEmpty()) {
			Node temp = stack.pop();
			sb.append(temp.data+",");
			
			if(null==temp.left){
				sb.append("#,");
			}
			
			if(null==temp.right){
				sb.append("#,");
			}
			
			if(null!=temp.right){
				stack.push(temp.right);
			}
			
			if(null!=temp.left){
				stack.push(temp.left);
			}
		}
		return sb.toString();
	}
	
	public Node deSerialize(String s){
		int t[] = {0};
		String arr[] = s.split(",");
		return deSerialize(arr,t);
	}
	
	public void preOrder(Node node){
		if(null==node)
			return;
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}

	private Node deSerialize(String[] arr, int[] t) {
		if(arr[t[0]].equals("#"))
			return null;
		Node node = new Node(Integer.parseInt(arr[t[0]]));
		t[0] = t[0] + 1;
		node.left = deSerialize(arr, t);
		t[0] = t[0] + 1;
		node.right = deSerialize(arr, t);
		return node;
	}
}
