package com.dlh.zambas.dp;

public class ProductOfThreeNumbers {

	public static void productOfThreeNumbers(int arr[]) {

		int highest = Math.max(arr[0], arr[1]);
		int lowest = Math.min(arr[0], arr[1]);

		int maximumProductOf2 = arr[0] * arr[1];
		int minimumProductOf2 = arr[0] * arr[1];

		int maximumProductOf3 = arr[0] * arr[1] * arr[2];

		for (int i = 2; i < arr.length; i++) {
			maximumProductOf3 = Math.max(maximumProductOf3,
					Math.max(maximumProductOf2 * arr[i], minimumProductOf2 * arr[i]));

			maximumProductOf2 = Math.max(maximumProductOf2, Math.max(arr[i] * highest, arr[i] * lowest));
			minimumProductOf2 = Math.min(minimumProductOf2, Math.min(arr[i]*highest, arr[i]*lowest));

			highest = Math.max(highest, arr[i]);
			lowest = Math.min(lowest, arr[i]);
			
		}
		
		System.out.println(maximumProductOf3);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,10,-5,1,-100};
		productOfThreeNumbers(arr);
	}
}
