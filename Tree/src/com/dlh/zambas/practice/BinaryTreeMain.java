package com.dlh.zambas.practice;

public class BinaryTreeMain {

	public static void main(String[] args) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		
		Node node1 = new Node(5);
		node1.left = new Node(-10);
		node1.right = new Node(3);
		node1.left.left = new Node(9);
		node1.left.right = new Node(8);
		node1.right.left = new Node(-4);
		node1.right.right = new Node(7);
		
		Inorder.inOrderTraversal(node);
		
	}
}
