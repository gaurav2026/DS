package com.dlh.zambas.graph;

public class ConnectedIsland {
	int ROW = 5;
	int COL = 5;

	public static void main(String[] args) throws java.lang.Exception {
		 int M[][]=  new int[][] {{1, 1, 0, 0, 0},
             {0, 1, 0, 0, 1},
             {1, 0, 0, 1, 1},
             {0, 0, 0, 0, 0},
             {1, 0, 1, 0, 1}
            };
		ConnectedIsland c = new ConnectedIsland();
		System.out.println("Number of islands is: " + c.countIslands(M));
	}

	private int countIslands(int[][] m) {
		boolean visited[][] = new boolean[ROW][COL];
		int count = 0;
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (m[i][j] == 1 && !visited[i][j]) {
					countIslandsUtil(m, visited, i, j);
					count++;
				}
			}
		}
		return count;
	}

	private void countIslandsUtil(int[][] m, boolean[][] visited, int row, int col) {
		visited[row][col] = true;
		int rowNb[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int colNb[] = { 1, 0, -1, 1, -1, 1, 0, -1 };
		for (int i = 0; i < rowNb.length; i++) {
			if (isSafe(m, visited, row + rowNb[i], col + colNb[i])) {
				countIslandsUtil(m, visited, row + rowNb[i], col + colNb[i]);
			}
		}
	}

	private boolean isSafe(int[][] m, boolean[][] visited, int row, int col) {
		return (row >= 0 && row < ROW && col >= 0 && col < COL && m[row][col] == 1 && !visited[row][col]);
	}
}
