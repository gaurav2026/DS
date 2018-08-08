package com.dlh.zambas.dp;

public class CombinationalSum {

	public static void combinationalSum(int arr[], int sum, int index) {
		int MAX_LIMIT = 2;
		if (sum == 0) {
			print(arr, index);
		} else if (sum > 0) {
			for (int i = 1; i <= MAX_LIMIT; i++) {
				arr[index] = i;
				combinationalSum(arr, sum-i, index+1);
			}
		}
	}

	public static void print(int arr[], int m) {
		for (int i = 0; i < m; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = new int[100];
		combinationalSum(arr, 3, 0);
	}
	
}
