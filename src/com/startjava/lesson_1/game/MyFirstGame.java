package com.startjava.lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int compNumber = 30;
		int playerNumber = 20;

		if(playerNumber <= 0 || playerNumber >= 100) {
			System.out.println("Your number is outside of range");
			return;
		}
		if(compNumber == playerNumber) {
			System.out.println("You guessed the number");
		}
		if(playerNumber > compNumber) {
			while (playerNumber > compNumber) {
				System.out.println("Your number is more than number of computer " + playerNumber);
				playerNumber--;
			}
		}
		if(playerNumber < compNumber) {
			while (playerNumber < compNumber) {
				System.out.println("Your number is less than number of computer " + playerNumber);
				playerNumber++;
			}
		}
		System.out.println("You guessed the number");
	}
}