package com.tic.tac.toe.test;

import java.util.Scanner;

public class TicTacToeMain {
	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		Scanner sc = new Scanner(System.in);
		int x=0,y=0;
		do {
			if(t.getCurrentPlayer() == 1){
				System.out.println("Player1 to select coordinates to fill X");
				x = sc.nextInt();
				y = sc.nextInt();
				t.putSign(x, y , "X");
				if(t.isMatchWon()){
					System.out.println("Player 1 won");
					t.display();
					break;
				}
			}else{
				System.out.println("Player2 to select coordinates to fill O");
				x = sc.nextInt();
				y = sc.nextInt();
				t.putSign(x, y , "O");
				if(t.isMatchWon()){
					System.out.println("Player 2 won");
					t.display();
					break;
				}
			}
			
			t.display();
		} while (t.isEmpty());
		
		if(!t.isEmpty()){
			System.out.println("It's a tie");
		}
	}
}
