package com.dlh.zambas.test;

public class MinimumDistance {
	 public static void main(String[] args) {
	        int arr[] = { 6, 6, 5, 4, 8, 3};
	        int x = 3;
	        int y = 6;
	 
	        System.out.println("Minimum distance between " + x + " and " + y
	                + " is " + minDistance(arr, x, y));
	    }

	private static int minDistance(int[] arr, int x, int y) {
		int minDistance = Integer.MAX_VALUE;
		int prev = -1;
		int prevIndex = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == x || arr[i] == y){
				if(i!=0 && arr[i]!=prev){
					minDistance = Math.min(minDistance, i-prevIndex);
				}
				prev = arr[i];
				prevIndex = i;
			}
		}
		return minDistance;
	}
}
