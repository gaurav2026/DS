package com.dlh.zambas.test;

public class BinaryTreeMain {

	public static void main(String[] args) {
		/*Node node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(70);
		node.left.left = new Node(20);
		node.left.right = new Node(40);
		node.right.left = new Node(60);
		node.right.right = new Node(80);
		node.right.right.right = new Node(100);*/
		
		
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.right = new Node(4);
		node.left.right.right = new Node(5);
		node.left.right.right.right = new Node(6);
		
		
		//VerticalOrderTest.printVerticalTraversal(node);
		
		VerticalOrderTraversal.verticalOrder(node);
	        
	}
}
