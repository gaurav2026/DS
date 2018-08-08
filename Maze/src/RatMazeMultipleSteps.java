
public class RatMazeMultipleSteps {
	public static void main(String[] args) {
		int maze[][] = { { 2, 1, 0, 0 }, { 3, 0, 0, 1 }, { 0, 1, 0, 1 }, { 0, 0, 0, 1 } };
		RatMazeMultipleSteps m = new RatMazeMultipleSteps();
		m.solveMaze(maze);
	}

	private void solveMaze(int[][] maze) {
		int sol[][] = new int[maze.length][maze.length];
		if (solveMazeUtil(maze, 0, 0, sol) == false) {
			System.out.println("Solution not possible");
		}
		printSolution(sol);
	}

	private void printSolution(int[][] sol) {
		for (int i = 0; i < sol.length; i++) {
			for (int j = 0; j < sol[i].length; j++) {
				System.out.print(" " + sol[i][j] + " ");
			}
			System.out.println();
		}

	}

	private boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
		if (x == maze.length - 1 && y == maze.length - 1) {
			sol[x][y] = 1;
			return true;
		}

		if (isSafe(maze, x, y)) {
			sol[x][y] = 1;

			for (int i = 1; i <= maze[x][y] && i < maze.length; i++) {

				if (solveMazeUtil(maze, x + i, y, sol) == true) {
					return true;
				}

				if (solveMazeUtil(maze, x, y + i, sol) == true) {
					return true;
				}
			}

			sol[x][y] = 0;
			return false;
		}
		return false;
	}

	private boolean isSafe(int[][] maze, int x, int y) {
		return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] != 0);
	}
}
