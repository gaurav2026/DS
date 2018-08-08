package com.dlh.zambas.stack;

import java.util.Stack;

public class NearestInteger {

	public static int[] returnNearestIntegerList(int[] A) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] modifiedList = new int[A.length];
		for(int i=0;i<A.length;i++){
			while(!stack.isEmpty() && stack.peek()>=A[i]){
				stack.pop();
			}
			if(stack.isEmpty()){
				modifiedList[i] = -1;
			}else{
				modifiedList[i] = stack.peek();
			}
			
			stack.push(A[i]);
		}
			
		for(int i=0;i<modifiedList.length;i++){
			System.out.print(modifiedList[i]+" ");
		}
		return modifiedList;

	}
	
	public static void main(String[] args) {
		int A[] = {34, 35, 27, 42, 5, 28, 39, 20, 28};
		returnNearestIntegerList(A);
	}
}
