package com.dlh.zambas.test;

public class Duplicates {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 1, 2, 3, 3, 3, 4, 4,4,4,4,4};
		int n = arr.length;
		n = new Duplicates().removeDuplicates(arr);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	private int removeDuplicates(int[] arr) {
		int j = 0;
		int n = arr.length-1;
		int count = 1;
		// Just maintaining another updated index i.e. j
		for (int i = 0; i < n ; i++){
			if(arr[i]==arr[i+1] && count<=2){
				arr[j++] = arr[i];
				count++;
			}
			else if(arr[i] == arr[i+1] && count > 2){
				count++;
			}
			else if(arr[i]!=arr[i+1] && count > 2){
				count = 1;
			}
			else if(arr[i]!=arr[i+1]){
				count = 1;
				arr[j++] = arr[i];
			}
		}
		System.out.println(arr[j] + " " + j);
		if(arr[j] != arr[arr.length-1]){
			arr[j++] = arr[arr.length-1];
		}
		
		if(arr[j] == arr[arr.length-1] && count<=2){
			arr[j++] = arr[arr.length-1];
		}

		return j;
	}

}
