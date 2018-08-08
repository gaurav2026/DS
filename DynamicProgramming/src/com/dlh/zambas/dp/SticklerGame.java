package com.dlh.zambas.dp;

public class SticklerGame {
	public static void main(String[] args) {
		int arr[] = { 5,  5, 10, 40, 50, 35 };
		findMaxSum(arr);
	}

	private static void findMaxSum(int[] arr) {
		if(arr.length==1){
			System.out.println("Max sum = " + arr[0]);
		}
		
		if(arr.length ==2){
			System.out.println("Max sum = " + Math.max(arr[0], arr[1]));
		}
		int dp[] = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		
		for(int i=2;i<arr.length;i++){
			dp[i] = Math.max(dp[i-2] + arr[i], dp[i-1]);
		}
		
		System.out.println("Max sum = " + dp[dp.length-1]);
	}
}
