package com.sudoku;

public class SudokuSolver {
	public static void main(String[] args) {

		Sudoku s = new Sudoku(); // you can also pass incomplete sudoku as a
									// parameter
		s.displaySudoku();

		if (s.solveSudoku()) {
			s.displaySudoku();
		} else {
			System.out.println("Unsuccessful");
		}

	}
}
