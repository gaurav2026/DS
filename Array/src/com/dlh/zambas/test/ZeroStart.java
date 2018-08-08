package com.dlh.zambas.test;

public class ZeroStart {
	public static void main(String[] args) {
		int arr[] = {1,2,3,0,0,0,4,5};
		zeroAtEnd(arr);
		zeroAtStart(arr);
	}

	private static void zeroAtStart(int[] arr) {
		int count = arr.length-1;
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]!=0){
				arr[count--] = arr[i];
			}
		}
		
		while(count>=0){
			arr[count--] = 0;
		}
		
		for(int i : arr){
			System.out.print(i+ " ");
		}
		
	}

	private static void zeroAtEnd(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr[count++] = arr[i];
			}
		}
		
		while(count<arr.length){
			arr[count++] = 0;
		}
		
		for(int i :arr){
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
}
