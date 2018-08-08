package com.dlh.zambas.dp;

import java.util.ArrayList;

public class CombinationalSum1 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> curr = new ArrayList<Integer>();
		int sum = 7;
		int arr1[] = { 2, 3, 6, 7 };
		findCombination(arr1, sum, 0, curr, result);
	}

	private static void findCombination(int[] arr1, int sum, int i, ArrayList<Integer> curr,
			ArrayList<ArrayList<Integer>> result) {
		
	}
}
