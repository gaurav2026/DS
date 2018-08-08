package com.dlh.zambas.graph;

public class Maze {
	int ROW = 4;
	int COL = 4;
	int visited[][] = new int[ROW][COL];

	public static void main(String[] args) {
		int maze[][] = { { 1, 0, 0, 0 }, { 0, 1, 0, 1 }, { 0, 0, 1, 1 }, { 0, 0, 0, 1 } };

		new Maze().solveMaze(maze);
	}

	private void solveMaze(int[][] maze) {
		if (!solveMazeUtil(maze, 0, 0)) {
			System.out.println("Solution doesn't exist");
			return;
		}
		printPath(visited);
	}

	private void printPath(int[][] visited) {
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].length; j++) {
				System.out.print(" " + visited[i][j] + " ");
			}
			System.out.println();
		}
	}

	private boolean solveMazeUtil(int[][] maze, int row, int col) {
		if (row == ROW - 1 && col == COL - 1) {
			visited[row][col] = 1;
			return true;
		}
		if (isSafe(maze, row, col)) {
			visited[row][col] = 1;

			if(solveMazeUtil(maze, row+1, col-1))
				return true;
			
			if(solveMazeUtil(maze, row+1, col+1))
				return true;
			
			if(solveMazeUtil(maze, row-1, col-1))
				return true;
			
			if(solveMazeUtil(maze, row-1, col+1))
				return true;
			
			if (solveMazeUtil(maze, row + 1, col))
				return true;

			if (solveMazeUtil(maze, row, col + 1))
				return true;

			visited[row][col] = 0;
			return false;
		}
		return false;
	}

	private boolean isSafe(int[][] maze, int r, int c) {
		return (r >= 0 && r < ROW && c >= 0 && c < COL && maze[r][c] != 0);
	}
}
