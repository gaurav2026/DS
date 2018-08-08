package com.dlh.zambas.test;

public class SortedMatrix {
	public static void main(String[] args) {
		int n = 4, m = 5, x = 28;
		int mat[][] = { { 0, 6, 8, 9, 11 }, { 20, 22, 28, 29, 31 }, { 36, 38, 50, 61, 63 }, { 64, 66, 100, 122, 128 } };

		sortedMatrixSearch(mat, n, m, x);
	}

	private static void sortedMatrixSearch(int[][] mat, int row, int column, int x) {
		int i = 0;
		int j = column - 1;
		while (i < row && j >= 0) {
			if (mat[i][j] == x) {
				System.out.println("found at (" + i + "," + j + ")");
				break;
			} else if (mat[i][j] > x) {
				j--;
			} else {
				i++;
			}
		}
	}
}
