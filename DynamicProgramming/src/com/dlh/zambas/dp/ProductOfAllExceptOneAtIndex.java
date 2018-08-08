package com.dlh.zambas.dp;

public class ProductOfAllExceptOneAtIndex {
	
	public static void productOfAllExceptOneAtIndex(int arr[]){
		int productArr[] = new int[arr.length];
		int productSoFar = 1;
		
		for(int i=0;i<arr.length;i++){
			productArr[i] = productSoFar;
			productSoFar *=arr[i];
		}
		
		productSoFar=1;
		for(int i=arr.length-1;i>=0;i--){
			productArr[i] *= productSoFar;
			productSoFar *=arr[i];
		}
		
		for(int i=0;i<productArr.length;i++)
			System.out.print(productArr[i]+" ");
			
	}
	
	public static void main(String[] args) {
		int arr[] = {1,7,3,4};
		productOfAllExceptOneAtIndex(arr);
	}
}	
