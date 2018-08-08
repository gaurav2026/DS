package com.dlh.zambas.dp;

public class DistributeCandy {
	public long maxCandy(int A[]) {
		int candy[] = new int[A.length];
		// Arrays.fill(candy, 1);
		for (int i = 0; i < A.length; i++)
			candy[i] = 1;

		for (int i = 1; i < A.length; i++) {
			if (A[i] > A[i - 1]) {
				candy[i] = Math.max(candy[i], candy[i - 1] + 1);
			}
		}

		for (int i = A.length - 2; i >= 0; i--) {
			if (A[i] > A[i + 1]) {
				candy[i] = Math.max(candy[i], candy[i + 1] + 1);
			}
		}
		long sum = 0;
		for (Integer i : candy)
			sum += i;

		return sum;

	}

	public static void main(String[] args) {
		//int arr[] = { 2, 4, 2, 6, 1, 7, 8, 9, 2, 1 };
		int arr[] = new int[100000];
		
		for (int i = 1; i < 100000; i++){
			arr[i] = 1+i;
		}
			System.out.println(new DistributeCandy().maxCandy(arr));
	}
}
