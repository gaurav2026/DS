package com.sudoku.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SudokuChecker {
	private static final int UNASSIGNED = 0;
	private int sudoku[][];

	private Set<Integer> rowSet;
	private Set<Integer> columnSet;
	private Set<Integer> boxSet;
	private List<HashSet<Integer>> arrList;

	public SudokuChecker() {
		sudoku = new int[9][9];
	}

	public SudokuChecker(int[][] sudoku) {
		this.sudoku = sudoku;
		rowSet = new HashSet<Integer>();
		columnSet = new HashSet<Integer>();
		boxSet = new HashSet<Integer>();
		arrList = new ArrayList<HashSet<Integer>>();
	}

	public boolean isCorrectSolution() {
		for (int i = 0; i < 27; i++)
			arrList.add(new HashSet<Integer>());

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				if(!isAllowed(row, col))
					return false;
			}
		}

		return true;
	}

	private boolean isAllowed(int row, int col) {
		rowSet = arrList.get(row);
		columnSet = arrList.get(col + 9);

		int box = 3 * (row / 3) + col / 3;
		boxSet = arrList.get(box + 18);

		return (rowSet.add(sudoku[row][col]) && columnSet.add(sudoku[row][col]) && boxSet.add(sudoku[row][col]));
	}

	public static void main(String[] args) {
		int[][] inputSudoku = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 4, 5, 6, 7, 8, 9, 1, 2, 3 },
				{ 7, 8, 9, 1, 2, 3, 4, 5, 6 }, { 2, 3, 4, 5, 6, 7, 8, 9, 1 }, { 5, 6, 7, 8, 9, 1, 2, 3, 4 },
				{ 8, 9, 1, 2, 3, 4, 5, 6, 7 }, { 3, 4, 5, 6, 7, 8, 9, 1, 2 }, { 6, 7, 8, 9, 1, 2, 3, 4, 5 },
				{ 9, 1, 2, 3, 4, 5, 6, 7, 8 } };

		SudokuChecker sc = new SudokuChecker(inputSudoku);

		if (sc.isCorrectSolution()) {
			System.out.println("Solution is Correct");
		} else {
			System.out.println("Incorrect Solution");
		}

	}
}
