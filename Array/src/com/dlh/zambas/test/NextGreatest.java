package com.dlh.zambas.test;

public class NextGreatest {
	public static void main(String[] args) {
		int arr[] = { 16, 17, 4, 3, 5, 2 };
		nextGreatest(arr);
		System.out.println("The modified array:");
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}

	private static void nextGreatest(int[] arr) {
		int max = arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--){
			int temp = arr[i];
			arr[i] = max;
			if(temp > max){
				max = temp;
			}
		}
		arr[arr.length-1] = -1;
	}
}
