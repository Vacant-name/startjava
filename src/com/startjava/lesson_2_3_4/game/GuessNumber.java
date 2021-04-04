package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

	Scanner sc = new Scanner(System.in);

	private Player playerOne;
	private Player playerTwo;

	GuessNumber(Player player1, Player player2) { // этот метод принимает параметры из тестового класса
		this.playerOne = player1;
		this.playerTwo = player2;
	}

	void intputNumberOne(Player playerOne) { // 11 запуск метода ввода числа первым игроком
		System.out.println(playerOne.getName() + " input your number... ");
		playerOne.setNumber(sc.nextInt());
		System.out.println(playerOne.getName() + " is thinking number  " + playerOne.getNumber());
	}

	void intputNumberTwo(Player playerTwo) {
		System.out.println(playerTwo.getName() + " input your number... ");
		playerTwo.setNumber(sc.nextInt());
		System.out.println(playerTwo.getName() + "is thinking number  " + playerTwo.getNumber());
	}
	private int compNumber;
	private boolean oneMoreTime;

	void falseThisOne(Player playerOne) {
		System.out.println("Player " + playerOne.getName() + " guessed number " + compNumber + " on the " + (playerOne.getAttempt() + 1) + " time");
		oneMoreTime = false;
	}

	void falseThisTwo(Player playerTwo) {
		System.out.println("Player " + playerTwo.getName() + " guessed number " + compNumber + " on the " + (playerTwo.getAttempt() + 1) + " time");
		oneMoreTime = false;
	}

	void trueThisOne(Player playerOne) {
		System.out.println(playerOne.getName() + "You aren't have attempts");
		oneMoreTime = true;
	}

	void trueThisTwo(Player playerTwo) {
		System.out.println(playerTwo.getName() + " You aren't have attempts");
		oneMoreTime = true;
	}

	void play() { // 5 метод запускается
		Random random = new Random(); // 6 создаем экз класса Random

		compNumber = random.nextInt(100) + 1; // 7 генерируем число от 0 до 100

		while(true) {  // 8 цикл проверки кол-ва попыток и перехода хода к другому игроку
			System.out.println("You are have 10 attempts");
			System.out.println("You need to guess number " + compNumber);
			oneMoreTime = true;

			for(int i = 0; i < 10; i++) { // 9 цикл кол-ва попыток
				intputNumberOne(playerOne); // 10 вызываем метод ввода числа первым игроком
				playerOne.setAttempt(i);
				playerOne.setEnteredNums(playerOne.getNumber());
				if(playerOne.getNumber() == compNumber) {
					falseThisOne(playerOne);
				}
				if (playerOne.getAttempt() == 10) {
					trueThisOne(playerOne);
				}

				intputNumberTwo(playerTwo);
				playerTwo.setAttempt(i);
				playerTwo.setEnteredNums(playerTwo.getNumber());
				if(playerTwo.getNumber() == compNumber) {
					falseThisTwo(playerTwo);
				}
				if(playerTwo.getAttempt() == 10) {
					trueThisTwo(playerTwo);
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