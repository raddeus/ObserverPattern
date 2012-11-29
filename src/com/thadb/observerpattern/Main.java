package com.thadb.observerpattern;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 String input;
		 System.out.println("Player 1: w - up, s - down, a - left, d - right");
		 System.out.println("Player 2: 8 - up, 5 - down, 4 - left, 6 - right");
		 GameImplement game = new GameImplement();
		 GameExtend game2 = new GameExtend();
		 GameComposition game3 = new GameComposition();
		 while (true){
			input = in.nextLine();
			game.sendInput(input);
			game2.sendInput(input);
			game3.sendInput(input);
		 }
	}

}
