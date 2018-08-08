package com.dlh.zambas.graph.practice;

public class ConnectedIsland {
	private int ROW = 5;
	private int COL = 5;
	private boolean visited[][] = new boolean[ROW][COL];

	public static void main(String[] args) {
		int M[][] = new int[][] { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 1 } };
		ConnectedIsland c = new ConnectedIsland();
		System.out.println("Number of islands is: " + c.countIslands(M));
	}

	private int countIslands(int[][] m) {
		int counter = 0;
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (m[i][j] == 1 && !visited[i][j]) {
					countIslandsUtil(m, i, j);
					counter++;
				}
			}
		}
		return counter;
	}

	private boolean countIslandsUtil(int[][] m, int r, int c) {
		visited[r][c] = true;
		int rowN[] = { -1, 0, 1, 1, 1, 0, -1, -1 };
		int colN[] = { 1, 1, 1, 0, -1, -1, -1, 0 };
		for (int i = 0; i < rowN.length; i++) {
			if (isSafe(m, r + rowN[i], c + colN[i])) {
				return countIslandsUtil(m, r + rowN[i], c + colN[i]);
			}
		}
		return false;
	}

	private boolean isSafe(int[][] m, int r, int c) {
		return (r >= 0 && r < ROW && c >= 0 && c < COL && !visited[r][c] && m[r][c] != 0);
	}
}
