package com.dlh.zambas.graph;

public class LargestRegion {
	int ROW = 4;
	int COL = 5;
	int count = 0;

	public static void main(String[] args) {
		int M[][] = { { 0, 0, 1, 1, 0 }, { 1, 0, 1, 1, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1 } };
		LargestRegion l = new LargestRegion();
		l.findLargestRegion(M);
	}

	private void findLargestRegion(int[][] m) {
		boolean[][] visited = new boolean[ROW][COL];
		int region = Integer.MIN_VALUE;

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (!visited[i][j] && m[i][j] == 1) {
					count = 1;
					findLargestRegionUtil(m, visited, i, j);
					region = Math.max(region, count);
				}
			}
		}

		System.out.println("Largest region : " + region);
	}

	private void findLargestRegionUtil(int[][] m, boolean[][] visited, int row, int col) {
		visited[row][col] = true;
		int rowNb[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int colNb[] = { 1, 0, -1, 1, -1, 1, 0, -1 };

		for (int i = 0; i < rowNb.length; i++) {
			if (isSafe(m, visited, row + rowNb[i], col + colNb[i])) {
				count++;
				findLargestRegionUtil(m, visited, row + rowNb[i], col+ colNb[i]);
			}
		}
	}

	private boolean isSafe(int[][] m, boolean[][] visited, int row, int col) {
		return (row >= 0 && row < ROW && col >= 0 && col < COL && !visited[row][col] && m[row][col]==1);
	}
}
