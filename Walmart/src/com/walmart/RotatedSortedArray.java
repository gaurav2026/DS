package com.walmart;

public class RotatedSortedArray {

	public int findElement(int[] arr, int low, int high, int key) {
		if (arr.length == 0) {
			throw new IllegalArgumentException("Size can't be zero");
		}
		
		if(low>high)
			return -1;

		int mid = (low + high) / 2;

		if (arr[mid] == key)
			return mid;

		/**
		 * low to mid is sorted
		 */
		if (arr[low] <= arr[mid]) {
			if (key >= arr[low] && key <= arr[mid]) {
				return findElement(arr, low, mid-1, key);
			}
			
			return findElement(arr, mid+1, high, key);
		}
		
		/**
		 * low to mid is not sorted
		 */
		if(key>=arr[mid] && key<=arr[high]){
			return findElement(arr, mid+1, high, key);
		}
		
		return findElement(arr, low, mid-1, key);
	}
	
	public static void main(String[] args) {
		int arr[] = {30,40,50,10,20};
		//int index = new RotatedSortedArray().findElement(arr, 0, arr.length-1, 00);
		int index = new RotatedSortedArray().searchElement(arr, 0, arr.length-1, 50);

		if(index!=-1){
			System.out.println("Found at " + index);
		}else{
			System.out.println("Not found");
		}
	}

	private int searchElement(int[] arr, int low, int high, int k) {
		if(arr.length == 0){
			throw new IllegalArgumentException();
		}
		if(low > high)
			return -1;
		
		int mid = (low+high)/2;
		
		if(arr[mid] == k)
			return mid;
		
		/*
		 * low to mid is sorted
		 */
		if(arr[low] <= arr[mid]){
			if(k>=arr[low] && k<=arr[mid]){
				return searchElement(arr, low, mid-1, k);
			}else{
				return searchElement(arr, mid+1, high, k);
			}
		}
		
		/**
		 * low to mid is not sorted
		 */
		if(k>=arr[mid] && k<=arr[high]){
			return  searchElement(arr, mid+1, high, k);
		}
		return searchElement(arr, low, mid-1, k);
	}
}
