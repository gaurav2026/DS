package com.dlh.zambas.test;

import java.util.Arrays;

public class Triplet {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 7, 6, 8, 9 };
		findTriplet(arr, 6);
	}

	private static void findTriplet(int[] arr, int product) {
		Arrays.sort(arr);
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > product)
				break;
			index++;
		}

		int left = 0;
		int right = index - 1;

		while (left <= right) {
			if (arr[left] * arr[right] == product) {
				System.out.println(arr[left] + " * " + arr[right] + " = " + product);
				if (arr[left] != arr[right])
					System.out.println(arr[right] + " * " + arr[left] + " = " + product);
				left++;
			} else if (arr[left] * arr[right] < product) {
				left++;
			} else {
				right--;
			}
		}
	}

}
