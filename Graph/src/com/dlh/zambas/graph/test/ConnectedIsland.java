package com.dlh.zambas.graph.test;

public class ConnectedIsland {
	int ROW = 3;
	int COL = 3;
	boolean visited[][] = new boolean[ROW][COL];

	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 0 }, { 0, 0, 1 }, { 1, 0, 1 } };

		new ConnectedIsland().countIslands(arr);
	}

	private void countIslands(int[][] arr) {
		int count = 0;
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (arr[i][j] == 1 && !visited[i][j]) {
					count++;
					countIslandsUtil(arr, i, j);
				}
			}
		}
		System.out.println(count);
	}

	private void countIslandsUtil(int[][] arr, int row, int col) {
		int rowNb[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int colNb[] = { 1, 0, -1, 1, -1, 1, 0, -1 };

		visited[row][col] = true;
		for (int i = 0; i < rowNb.length; i++) {
			if (isSafe(arr, row + rowNb[i], col + colNb[i])) {
				countIslandsUtil(arr, row + rowNb[i], col + colNb[i]);
			}
		}
	}

	private boolean isSafe(int[][] arr, int row, int col) {
		return (row >= 0 && row < ROW && col >= 0 && col < COL && arr[row][col] == 1 && !visited[row][col]);
	}
}
