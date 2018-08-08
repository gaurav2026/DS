package com.array;

public class SortedMatrix {
	public static void main(String[] args) {
		int n = 4, m = 5, x = 5;
		int mat[][] = { { 0, 6, 8, 9, 11 }, { 20, 22, 28, 29, 31 }, { 36, 38, 50, 61, 63 }, { 64, 66, 100, 122, 128 } };

		largestElementSearch(mat, n, m, x);
	}

	private static void largestElementSearch(int[][] mat, int n, int m, int x) {
		
		int row = x-1/n;
		System.out.println(row);
		int col = x-1%m;
		System.out.println(col);
		
		//System.out.println(mat[row][col]);
	}
}
