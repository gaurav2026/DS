package com.sudoku.test;

public class SudokuTest {
	public static void main(String[] args) {
		Sudoku sudoku = new Sudoku();
		if (sudoku.solveSudoku()) {
			sudoku.display();
		} else {
			System.out.println("Sodoku wrongly formed");
		}
	}
}
