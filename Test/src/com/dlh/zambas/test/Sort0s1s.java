package com.dlh.zambas.test;

public class Sort0s1s {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 0, 1 };
		int type0 = 0;
		int type1 = arr.length - 1;
		while (type0 < type1) {
			if (arr[type0] == 1) {
				arr[type1] = arr[type1] + arr[type0];
				arr[type0] = arr[type1] - arr[type0];
				arr[type1] = arr[type1] - arr[type0];
				type1--;
			}else{
				type0++;
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
