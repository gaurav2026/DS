package com.tic.tac.toe.test;

public class TicTacToe {

	public static final int EMPTY = 0;
	public boolean isEmpty = false;
	private int board[][] = new int[3][3];
	private boolean isMatchWon = false;
	private int counter = 0;
	private int currentPlayer = 1;

	public boolean isMatchWon() {
		return isMatchWon;
	}

	public int getCurrentPlayer() {
		return currentPlayer;
	}



	public void putSign(int x, int y, String value) {
		if (x < 0 || y < 0 || x > 2 || y > 2) {
			System.out.println("Invalid board position");
			return;
		}

		if (board[x][y] != EMPTY) {
			System.out.println("Board position occupied");
			return;
		}

		if (value.equalsIgnoreCase("X")) {
			board[x][y] = 1;
			isMatchWon = matchWon(1);
		} else {
			board[x][y] = -1;
			isMatchWon = matchWon(-1);
		}
		currentPlayer = -currentPlayer;
		counter++;
	}

	public void display() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				switch (board[i][j]) {
				case 1:
					sb.append(" X ");
					break;
				case -1:
					sb.append(" O ");
					break;
				case EMPTY:
					sb.append("   ");
					break;
				}
				if (j < 2) {
					sb.append("|");
				}

			}
			if (i < 2) {
				sb.append("\n-----------\n");
			}
		}
		System.out.println(sb.toString());
	}

	private boolean matchWon(int player) {
		return ((board[0][0] + board[0][1] + board[0][2] == player * 3)
				|| (board[1][0] + board[1][1] + board[1][2] == player * 3)
				|| (board[2][0] + board[2][1] + board[2][2] == player * 3)
				|| (board[0][0] + board[1][0] + board[2][0] == player * 3)
				|| (board[0][1] + board[1][1] + board[2][1] == player * 3)
				|| (board[0][2] + board[1][2] + board[2][2] == player * 3)
				|| (board[0][0] + board[1][1] + board[2][2] == player * 3)
				|| (board[2][0] + board[1][1] + board[0][2] == player * 3));
	}

	public boolean isEmpty() {
		if (counter < 9)
			return true;
		else
			return false;
	}
}
