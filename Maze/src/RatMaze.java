public class RatMaze {
	public static void main(String[] args) {
		RatMaze rat = new RatMaze();
		int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
		rat.solveMaze(maze);
	}

	private void solveMaze(int[][] maze) {
		int sol[][] = new int[4][4];

		if (solveMazeUtil(maze, 0, 0, sol) == false) {
			System.out.println("Solution doesn not exist");
		}
		
		printSolution(sol);
	}

	private void printSolution(int[][] sol) {
		for(int i=0;i<sol.length;i++){
			for(int j=0;j<sol[i].length;j++){
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

		if (isSafeMaze(maze, x, y) == true) {
			sol[x][y] = 1;
			
			if(solveMazeUtil(maze, x+1, y, sol) == true){
				return true;
			}
			
			if(solveMazeUtil(maze, x, y+1, sol) == true){
				return true;
			}
			
			sol[x][y] = 0;
			return false;
			
		}
		return false;
	}

	private boolean isSafeMaze(int[][] maze, int x, int y) {
		return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
	}
}
