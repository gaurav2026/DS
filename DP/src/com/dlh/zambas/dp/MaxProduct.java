package com.dlh.zambas.dp;

public class MaxProduct {

	public int maxProduct(int[] A) {
		int maxProduct = 1;
		int maxEndingHere = 1;
		int minEndingHere = 1;

		if (A.length == 1 && A[0] == 0)
			return 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				maxEndingHere = maxEndingHere * A[i];
				minEndingHere = Math.min(minEndingHere * A[i], 1);
			} else if (A[i] == 0) {
				maxEndingHere = 1;
				minEndingHere = 1;
			} else {
				int temp = maxEndingHere;
				maxEndingHere = Math.max(minEndingHere * A[i], 1);
				minEndingHere = temp * A[i];
			}

			maxProduct = Math.max(maxEndingHere, maxProduct);
		}

		if (maxProduct == 1) {
			for(int i=0;i<A.length;i++){
				if(A[i]>0){
					return maxProduct;
				}
			}
			maxProduct = 0;
		}
		return maxProduct;
	}

	public static void main(String[] args) {
		int A[] = { 2, 3, -2, 4, 6, 3 };
		System.out.println(new MaxProduct().maxProduct(A));
	}
}
