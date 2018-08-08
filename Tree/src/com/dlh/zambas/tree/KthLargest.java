package com.dlh.zambas.tree;

import java.util.ArrayList;
import java.util.List;

public class KthLargest {
	 List<Integer> list = new ArrayList<Integer>();
	    public int kthsmallest(Node A, int B) {
	        if(B<=0)
	            throw new IllegalArgumentException("B must be greater than 0");
	        inOrderTraversal(A);
	        return list.get(B-1);
	    }
	    
	    private void inOrderTraversal(Node A){
	        if(null==A)
	            return;
	        inOrderTraversal(A.left);
	        list.add(A.data);
	        inOrderTraversal(A.right);
	    }
}
