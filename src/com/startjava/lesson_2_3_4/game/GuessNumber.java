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

	void intputNumberTwo(Player playerTwo) { // 12 запуск метода ввода числа вторым игроком
		System.out.println(playerTwo.getName() + " input your number... ");
		playerTwo.setNumber(sc.nextInt());
		System.out.println(playerTwo.getName() + " is thinking number  " + playerTwo.getNumber());
	}
	private int compNumber;
	private int checkOneMoreTime;

	void winOne(Player playerOne) { // 18 победа
		System.out.println("Player " + playerOne.getName() + " guessed number " + compNumber + " on the " + (playerOne.getAttempt() + 1) + " time");
	}

	void winTwo(Player playerTwo) {
		System.out.println("Player " + playerTwo.getName() + " guessed number " + compNumber + " on the " + (playerTwo.getAttempt() + 1) + " time");
	}

	void loseOne(Player playerOne) { //20 проиграл
		System.out.println(playerOne.getName() + "You aren't have attempts");
	}

	void loseTwo(Player playerTwo) {
		System.out.println(playerTwo.getName() + " You aren't have attempts");
	}

	void play() { // 5 запуск игры
		do {
			Random random = new Random(); // 6 создаем экз класса Random
			compNumber = random.nextInt(100) + 1; // 7 генерируем число от 0 до 100
			System.out.println("You are have 10 attempts");
			System.out.println("You need to guess number " + compNumber);

			for (int i = 0; i < 10; i++) { // 8 запуск цикла подсчета кол-ва попыток
				intputNumberOne(playerOne); // 9 вызываем метод ввода числа первым игроком
				playerOne.setAttempt(i); // 13 попытки вввода повторяются пока не заполнится массив класса PlayerOne
				playerOne.setEnteredNums(playerOne.getNumber()); // 14 загрузка введенного числа в массив класса игрока PlayerOne
				if (playerOne.getNumber() == compNumber) { // 15 сравнение чисел
					checkOneMoreTime = compNumber; // 16 если угадали то
					winOne(playerOne); // 17 переходим в метод победителя
					break; // 16 и выходим из цикла попыток
				}
				if (playerOne.getAttempt() == 9) { // 17 если число попыток исчерпано то
					loseOne(playerOne); // 19 в метод 20 и ждем очереди второго игрока
				}

				intputNumberTwo(playerTwo);
				playerTwo.setAttempt(i);
				playerTwo.setEnteredNums(playerTwo.getNumber());
				if (playerTwo.getNumber() == compNumber) {
					checkOneMoreTime = compNumber;
					winTwo(playerTwo);
					break;
				}
				if (playerTwo.getAttempt() == 9) {
					loseTwo(playerTwo);
					break;
				}
			}
			int screenOne[] = new int[10]; // объявление массива для приема и дальнейшей выдачи на экран чисел введенных ироком 1
			int screenTwo[] = new int[10]; // объявление массива для приема и дальнейшей выдачи на экран чисел введенных ироком 2
			screenOne = (Arrays.copyOf(playerOne.getEnteredNums(), playerOne.getAttempt() + 1));
			screenTwo = (Arrays.copyOf(playerTwo.getEnteredNums(), playerTwo.getAttempt() + 1));
			System.out.println(Arrays.toString(playerOne.getEnteredNums())); // выводим на экран
			System.out.println(Arrays.toString(playerTwo.getEnteredNums())); // выводим на экран
			Arrays.fill(playerOne.getEnteredNums(), 0); // обнуляем массив
			Arrays.fill(playerTwo.getEnteredNums(), 0); // обнуляем массив
			if(checkOneMoreTime != compNumber) {
				System.out.println("One more time");
			}
		} while(checkOneMoreTime != compNumber);
	}
}