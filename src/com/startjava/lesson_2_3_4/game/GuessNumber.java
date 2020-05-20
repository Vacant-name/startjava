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
		int attempts1 = 0;
		int attempts2 = 0;

		while(true) {
			System.out.println("You have 10 attempts");
			System.out.println("You must guess the number " + compNumber);
			boolean oneMoreTime = true;
			int[] checkArr1 = new int[10];
			int[] checkArr2 = new int[10];

			for(int i = 0; i <= 10; i++) {
				System.out.println("The first player inputing his number... ");
				playerOne.setNumber(sc.nextInt());
				System.out.println("The first player thinking this number  " + playerOne.getNumber());
				playerOne.setJ(i);
				playerOne.setArrayNumbers(playerOne.getNumber());
				attempts1++;
				if(playerOne.getNumber() == compNumber) {
					System.out.println("Player " + playerOne.getName() + " guessed the number " + compNumber + " on the " + attempts1 + " try");
					oneMoreTime = false;
					break;
				}
				if (attempts1 == 10) {
					System.out.println(playerOne.getName() + " doesn't have the attempts");
					oneMoreTime = true;
					break;
				}

				System.out.println("The second player inputing his number... ");
				playerTwo.setNumber(sc.nextInt());
				System.out.println("The second player thinking this number  " + playerTwo.getNumber());
				playerTwo.setJ(i);
				playerTwo.setArrayNumbers(playerTwo.getNumber());
				attempts2++;
				if(playerTwo.getNumber() == compNumber) {
					System.out.println("Player " + playerTwo.getName() + " guessed the number " + compNumber + " on the " + attempts2 + " try");
					oneMoreTime = false;
					break;
				}
				if(attempts2 == 10) {
					System.out.println(playerTwo.getName() + " doesn't have the attempts");
					oneMoreTime = true;
					break;
				}
			}
			if(!oneMoreTime) {
				int[] screenArr1 = Arrays.copyOf(playerOne.getArrayNumbers(),attempts1);
				for(int i = 0; i < screenArr1.length; i++) {
					checkArr1[i] = i;
					System.out.print(screenArr1[i] + " ");
				}
				System.out.println();
				int[] screenArr2 = Arrays.copyOf(playerTwo.getArrayNumbers(),attempts2);
				for(int i = 0; i < screenArr2.length; i++) {
					checkArr2[i] = i;
					System.out.print(screenArr2[i] + " ");
				}
				System.out.println();
				break;
			}
			Arrays.fill(checkArr1, 0);
			Arrays.fill(checkArr2, 0);
			System.out.println("One more time");
		} //while
	}
}