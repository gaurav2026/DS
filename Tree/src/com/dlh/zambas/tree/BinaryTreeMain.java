package com.dlh.zambas.tree;

import java.util.Collections;
import java.util.List;

public class BinaryTreeMain {

	public static void main(String[] args) {
		Node node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(70);
		node.left.left = new Node(20);
		node.left.right = new Node(40);
		node.right.left = new Node(60);
		node.right.right = new Node(80);
		node.right.right.right = new Node(100);

		/*
		 * SerializationDeserialization s = new SerializationDeserialization();
		 * System.out.println(s.serialize(node)); s.preOrder(node);
		 * 
		 * System.out.println(); Node n = s.deSerialize(s.serialize(node));
		 * s.preOrder(n);
		 */
		LCA tree = new LCA();
		
		
		Node lca = tree.findLCA(node, 30, 70);
        if (lca != null)
            System.out.println("LCA(30, 70) = " + lca.data);
        else
            System.out.println("Keys are not present");
         
        LCA.v1 = false; LCA.v2 = false;
 
        lca = tree.findLCA(node, 20, 100);
        if (lca != null)
            System.out.println("LCA(20, 100) = " + lca.data);
        else
            System.out.println("Keys are not present");
        
        Node node1 = new Node(10);
		node1.left = new Node(2);
		node1.right = new Node(7);
		node1.left.left = new Node(8);
		node1.left.right = new Node(4);
		
		
	}
}
