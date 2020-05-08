package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String answer;
		do {
			System.out.println("Enter the name of the first player");
			Player player1 = new Player(sc.nextLine());

			System.out.println("Enter the name of the second player");
			Player player2 = new Player(sc.nextLine());

			GuessNumber game = new GuessNumber(player1,player2);
			game.play();
			do {
				System.out.println("Want to continue ? [Y/N]");
				answer = sc.nextLine();
			} while(!answer.equals("Y") && !answer.equals("N"));
		} while(answer.equals("Y"));
		System.out.println("See you");
	}
}