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

	void intputNumber(Player playerOne, Player playerTwo) {
		System.out.println(playerOne.getName() + " inputing his number... ");
		playerOne.setNumber(sc.nextInt());
		System.out.println(playerOne.getName() + " thinking this number  " + playerOne.getNumber());
		playerOne.setAttempt(i);
		playerOne.setEnteredNums(playerOne.getNumber());

		System.out.println(playerTwo.getName() + " inputing his number... ");
		playerTwo.setNumber(sc.nextInt());
		System.out.println(playerTwo.getName() + " thinking this number  " + playerTwo.getNumber());
		playerTwo.setAttempt(i);
		playerTwo.setEnteredNums(playerTwo.getNumber());
	}
	private int compNumber;
	private boolean oneMoreTime;

	void falseThis(Player playerOne, Player playerTwo) {
		System.out.println("Player " + playerOne.getName() + " guessed the number " + compNumber + " on the " + (playerOne.getAttempt() + 1) + " try");
		oneMoreTime = false;
		System.out.println("Player " + playerTwo.getName() + " guessed the number " + compNumber + " on the " + (playerTwo.getAttempt() + 1) + " try");
		oneMoreTime = false;
	}

	void trueThis(Player playerOne, Player playerTwo) {
		System.out.println(playerOne.getName() + " doesn't have the attempts");
		oneMoreTime = true;
		System.out.println(playerTwo.getName() + " doesn't have the attempts");
		oneMoreTime = true;
	}

	void play() {
		Random random = new Random();

		compNumber = random.nextInt(100) + 1;

		while(true) {
			System.out.println("You have 10 attempts");
			System.out.println("You must guess the number " + compNumber);
			oneMoreTime = true;

			for(int i = 0; i < 10; i++) {
				intputNumber(Player playerOne);
				if(playerOne.getNumber() == compNumber) {
					falseThis(Player playerOne);
				}
				if (playerOne.getAttempt() == 10) {
					trueThis(Player playerOne);
				}

				intputNumber(Player playerTwo);
				if(playerTwo.getNumber() == compNumber) {
					falseThis(Player playerTwo)
				}
				if(playerTwo.getAttempt() == 10) {
					trueThis(Player playerTwo);
				}
			} // for
			if(!oneMoreTime) {
				int screenOne[] = new int[10];
				int screenTwo[] = new int[10];
				screenOne = (Arrays.copyOf(playerOne.getEnteredNums(), playerOne.getAttempt() + 1));
				screenTwo = (Arrays.copyOf(playerTwo.getEnteredNums(), playerTwo.getAttempt() + 1));
				System.out.println(Arrays.toString(playerOne.getEnteredNums()));
				System.out.println(Arrays.toString(playerTwo.getEnteredNums()));
				break;
			}
			Arrays.fill(playerOne.getEnteredNums(), 0);
			Arrays.fill(playerTwo.getEnteredNums(), 0);
			System.out.println("One more time");
		} // while
	}
}