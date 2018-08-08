package com.dlh.zambas.test;

public class CountFreqeuncy {
	public static void main(String[] args) {
		CountFreqeuncy count = new CountFreqeuncy();
        int arr[] = {2, 3, 3, 2, 5};
        int n = arr.length;
        count.printfrequency(arr, n);
	}

	private void printfrequency(int[] arr, int n) {
		for(int i=0;i<n;i++)
			arr[i] = arr[i]-1;
		
		for(int i=0;i<n;i++){
			arr[arr[i]%n] = arr[arr[i]%n] + n;
		}
		
		for(int i=0;i<n;i++){
			System.out.println(1+i+" --> " + arr[i]/n);
		}
	}
}
