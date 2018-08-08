package com.array;

public class Sort0s1s2s {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		sort(arr);
	}

	private static void sort(int[] arr) {
		int mid = 0, temp =0;
		int low = 0, high = arr.length - 1;
		while (mid <= high) {
			switch (arr[mid]) {
			case 0:
				 temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				 temp = arr[mid];
				 arr[mid] = arr[high];
				 arr[high] = temp;
				 high--;
				break;
			default:
				break;
			}
		}
		
		for(int i :arr){
			System.out.print(i+" ");
		}
	}
}
