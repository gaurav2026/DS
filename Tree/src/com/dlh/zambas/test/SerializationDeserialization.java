package com.dlh.zambas.test;

import java.util.Stack;

public class SerializationDeserialization {

	public String serialize(Node a) {
		if (null == a) {
			return null;
		}
		Stack<Node> stack = new Stack<Node>();
		stack.push(a);
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			Node temp = stack.pop();
			if (null != temp) {
				sb.append(temp.data + ",");
				stack.push(temp.right);
				stack.push(temp.left);
			} else {
				sb.append("#,");
			}
		}
		return sb.toString();

	}

	public Node deSerialize(String nodes){
		if(null==nodes || nodes.isEmpty()){
			return null;
		}
		int[] t = {0};
		String arr[] = nodes.split(",");
		return deSerialize(arr, t);
	}

	private Node deSerialize(String[] arr, int[] t) {
		System.out.println(arr[t[0]]);
		if(arr[t[0]].equals("#")){
			return null;
		}
		Node node = new Node(Integer.parseInt(arr[t[0]]));
		t[0] = t[0] +1;
		node.left = deSerialize(arr, t);
		t[0] = t[0] +1 ;
		node.right = deSerialize(arr, t);
		
		return node;
	}
}
