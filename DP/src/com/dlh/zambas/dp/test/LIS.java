package com.dlh.zambas.dp.test;

import java.util.Arrays;

public class LIS {
	public static void main(String args[]) {
		int arr[] = { 3, 10, 2, 1, 20 };
		int n = arr.length;
		System.out.println("Length of lis is " + lis(arr, n));
	}

	private static int lis(int[] arr, int n) {
		if (n == 0)
			return 0;
		int dp[] = new int[n];
		Arrays.fill(dp, 1);
		
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dp[j] + 1 > dp[i]) {
					dp[j] = dp[j] + 1;
				}
			}
		}
		for (int i = 0; i < dp.length; i++) {
			if (dp[i] > max) {
				max = dp[i];
			}
		}
		return max;
	}
}
