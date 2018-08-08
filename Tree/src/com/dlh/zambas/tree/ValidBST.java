package com.dlh.zambas.tree;

import java.util.ArrayList;
import java.util.List;

public class ValidBST {

	List<Integer> list = new ArrayList<Integer>();
	
	public boolean isBST(Node node) throws IllegalAccessException{
		if(null==node){
			throw new IllegalAccessException("Can't be null");
		}
		inOrderTraversal(node);
		for(int i=0;i<list.size()-1;i++){
			if(list.get(i)>list.get(i+1))
				return false;
		}
		return true;
	}
	
	private void inOrderTraversal(Node node){
		if(null==node)
			return;
		
		inOrderTraversal(node.left);
		list.add(node.data);
		inOrderTraversal(node.right);
	}
}
