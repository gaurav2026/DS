package com.dlh.zambas.tree;

public class ArrayToBST {

	public Node convertToBST(int[] arr, int low, int high){
		if(low > high)
			return null;
		
		int mid = (low+high)/2;
		
		Node node = new Node(arr[mid]);
		
		node.left = convertToBST(arr, low, mid-1);
		
		node.right = convertToBST(arr, mid+1, high);
		
		return node;
		
	}
}
