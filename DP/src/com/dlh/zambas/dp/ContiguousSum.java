package com.dlh.zambas.dp;

public class ContiguousSum {
	public static int largestContiguousSum(int[] arr) {
		int maxSum = arr[0];
		int currSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			currSum = Math.max(arr[i], currSum + arr[i]);
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;

	}
	public static void main(String[] args) {
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(largestContiguousSum(arr));
	}
}
