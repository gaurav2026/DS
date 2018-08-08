package com.dlh.zambas.dp;

public class MaximumSubArraySum {
	 
    public static int findMaxSubarraySum(int[] input) {
    	int max_so_far = input[0];
    	int curr_sum = input[0];
    	for(int i=1;i<input.length;i++){
    		curr_sum = Math.max(input[i],curr_sum+input[i]);
    		max_so_far = Math.max(max_so_far, curr_sum);
    	}
		return max_so_far;
    	
    }
     
    public static void main(String[] args) {
        int[] input = { -2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum subarray sum is " + findMaxSubarraySum(input));
    }
}
