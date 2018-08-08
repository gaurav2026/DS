package com.dlh.zambas.test;

public class kthSmallestTest {
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 4, 19, 26 }; // 3, 4, 5, 7, 12, 19, 26 ; l = 7; k = 7-3+1;
		int k = 3;
		System.out.print("K'th smallest element is " + kthSmallest(arr, 0, arr.length - 1, 5));
		System.out.println();
		System.out.println(arr[0]);
	}

	private static int kthSmallest(Integer[] arr, int l, int r, int k) {
		if (k >= 0 && k < r - l + 1) {
			int pos = partition(arr, l, r);

			if (pos - l == k - 1) {
				return arr[pos];
			}
			
			if(pos -l >k-1){
				return kthSmallest(arr, pos-1, r, k);
			}else{
				return kthSmallest(arr, pos+1, r, k-pos+l-1);
			}
		}
		return Integer.MAX_VALUE;
	}

	private static int partition(Integer[] arr, int l, int r) {
		int i = l;
		int x = arr[r];
		for (int j = l; j <= r - 1; j++) {
			if (arr[j] >= x) {
				swap(arr[i], arr[j]);
				i++;
			}
		}
		swap(arr[i], arr[r]);
		return i;
	}

	private static void swap(Integer a, Integer b) {
		int t = a;
		a = b;
		b = t;
	}

}
