package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

	Scanner sc = new Scanner(System.in);

	private Player playerOne;
	private Player playerTwo;

	GuessNumber(Player player1, Player player2) {
		this.playerOne = player1;
		this.playerTwo = player2;
	}

	void play() {
		Random random = new Random();

		int compNumber = random.nextInt(100) + 1;

		while(true) {
			System.out.println("You have 10 attempts");
			System.out.println("You must guess the number " + compNumber);
			boolean oneMoreTime = true;

			for(int i = 0; i < 10; i++) {
				System.out.println("The first player inputing his number... ");
				playerOne.setNumber(sc.nextInt());
				System.out.println("The first player thinking this number  " + playerOne.getNumber());
				playerOne.setAttempt(i);
				playerOne.setEnteredNum(playerOne.getNumber());

				if(playerOne.getNumber() == compNumber) {
					System.out.println("Player " + playerOne.getName() + " guessed the number " + compNumber + " on the " + (playerOne.getAttempt() + 1) + " try");
					oneMoreTime = false;
					break;
				}
				if (playerOne.getAttempt() == 10) {
					System.out.println(playerOne.getName() + " doesn't have the attempts");
					oneMoreTime = true;
					break;
				}

				System.out.println("The second player inputing his number... ");
				playerTwo.setNumber(sc.nextInt());
				System.out.println("The second player thinking this number  " + playerTwo.getNumber());
				playerTwo.setAttempt(i);
				playerTwo.setEnteredNum(playerTwo.getNumber());

				if(playerTwo.getNumber() == compNumber) {
					System.out.println("Player " + playerTwo.getName() + " guessed the number " + compNumber + " on the " + (playerTwo.getAttempt() + 1) + " try");
					oneMoreTime = false;
					break;
				}
				if(playerTwo.getAttempt() == 10) {
					System.out.println(playerTwo.getName() + " doesn't have the attempts");
					oneMoreTime = true;
					break;
				}
			} // for
			if(!oneMoreTime) {
				playerOne.setScreen(Arrays.copyOf(playerOne.getEnteredNum(), playerOne.getAttempt() + 1));
				playerTwo.setScreen(Arrays.copyOf(playerTwo.getEnteredNum(), playerTwo.getAttempt() + 1));
				System.out.println(Arrays.toString(playerOne.getScreen()));
				System.out.println(Arrays.toString(playerTwo.getScreen()));
				break;
			}
			Arrays.fill(playerOne.getScreen(), 0);
			Arrays.fill(playerTwo.getScreen(), 0);
			System.out.println("One more time");
		} // while
	}
}