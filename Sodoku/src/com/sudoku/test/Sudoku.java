package com.sudoku.test;

public class Sudoku {
	private final static int UNASSIGNED = 0;
	private int[][] sudoku;

	public Sudoku() {
		sudoku = new int[9][9];
	}

	private boolean isAllowedInRow(int row, int num) {
		for (int col = 0; col < 9; col++) {
			if (sudoku[row][col] == num)
				return true;
		}
		return false;
	}

	private boolean isAllowedInColumn(int col, int num) {
		for (int row = 0; row < 9; row++) {
			if (sudoku[row][col] == num) {
				return true;
			}
		}
		return false;
	}

	private boolean isAllowedInBox(int row, int col, int num) {
		int r = row - row % 3;
		int c = col - col % 3;

		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (sudoku[i][j] == num) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isAllowed(int row, int col, int num) {
		return !(isAllowedInBox(row, col, num) || isAllowedInColumn(col, num) || isAllowedInRow(row, num));
	}

	public void display() {
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.println("----------------------------------\n");
			}
			for (int j = 0; j < 9; j++) {
				if (j % 3 == 0 && j != 0) {
					System.out.print(" | ");
				}
				System.out.print(" " + sudoku[i][j] + " ");

			}

			System.out.println();
		}
		System.out.println("\n\n__________________________________________\n\n");
	}

	public boolean solveSudoku() {
		for(int row=0;row<9;row++)
		{
			for(int col=0;col<9;col++)
			{
				if(sudoku[row][col]==UNASSIGNED)
				{
					for(int number=1;number<=9;number++)
					{
						if(isAllowed(row, col, number))
						{
							sudoku[row][col] = number;
							if(solveSudoku())
							{
								return true;
							}
							else
							{
								sudoku[row][col] = UNASSIGNED;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}
}
