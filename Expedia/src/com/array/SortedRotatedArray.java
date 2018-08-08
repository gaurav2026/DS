package com.array;

public class SortedRotatedArray {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int i = search(arr, 0, arr.length - 1, 5);
		System.out.println(i);
	}

	private static int search(int[] arr, int low, int high, int x) {
		int mid = (low + high) / 2;
		if (low > high) {
			return -1;
		}
		if (arr[mid] == x)
			return mid;
		if (arr[low] <= arr[mid]) {
			if (x <= arr[mid] && x >= arr[low])
				return search(arr, low, mid - 1, x);
			else
				return search(arr, mid + 1, high, x);
		} else {
			if (x >= arr[mid] && x <= arr[high])
				return search(arr, mid + 1, high, x);
		}
		return search(arr, low, mid - 1, x);
	}
}
