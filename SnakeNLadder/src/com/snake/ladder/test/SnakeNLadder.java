package com.snake.ladder.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakeNLadder {
	private static Map<Integer, Integer> snakeMap = new HashMap<Integer, Integer>();
	private static Map<Integer, Integer> ladderMap = new HashMap<Integer, Integer>();

	private static int WIN_POINT = 100;
	private Random random = null;

	static {
		snakeMap.put(99, 54);
		snakeMap.put(70, 55);
		snakeMap.put(52, 42);
		snakeMap.put(25, 2);
		snakeMap.put(95, 72);

		ladderMap.put(6, 25);
		ladderMap.put(11, 40);
		ladderMap.put(17, 69);
		ladderMap.put(46, 90);
		ladderMap.put(60, 85);
	}

	public SnakeNLadder() {
		random = new Random();
	}

	private boolean isGameWon(int value) {
		return WIN_POINT == value;
	}

	private int calculatePlayer(int player, int discValue) {
		player += discValue;
		if (player > WIN_POINT) {
			player = player - discValue;
			return player;
		}

		if (snakeMap.containsKey(player)) {
			System.out.println("Swallowed by snake");
			player = snakeMap.get(player);
			return player;
		}

		if (ladderMap.containsKey(player)) {
			System.out.println("Climbed up the ladder");
			player = ladderMap.get(player);
			return player;
		}

		return player;

	}

	private int discRoll() {
		int n = random.nextInt(7);
		return n == 0 ? 1 : n;
	}

	public void start() {
		int currentPlayer = -1;
		int player1 = 0, player2 = 0;
		Scanner sc = new Scanner(System.in);
		String str = null;
		int discValue = 0;
		do {
			System.out.println("Press r to continue the game");
			str = sc.nextLine();
			discValue = discRoll();
			if (currentPlayer == -1) {
				System.out.println("Player1 to roll the dice");
				player1 = calculatePlayer(player1, discValue);
				System.out.println("Value of player1 " + player1);
				System.out.println("Value of player1 " + player2);

				if (isGameWon(player1)) {
					System.out.println("Player1 won the game");
					return;
				}
			} else {
				System.out.println("Player2 to roll the dice");
				player2 = calculatePlayer(player2, discValue);
				System.out.println("Value of player1 " + player1);
				System.out.println("Value of player1 " + player2);

				if (isGameWon(player2)) {
					System.out.println("Player2 won the game");
					return;
				}
			}
			currentPlayer = -currentPlayer;
		} while ("r".equalsIgnoreCase(str));
	}

}
