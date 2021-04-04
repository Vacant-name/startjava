package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;

		do {
			System.out.println("Enter 1st player name");//1 ввод имени первого игрока
			Player player1 = new Player(sc.nextLine());//1 создаем экз класса Player через конструктор и вводим имя первого игрока
			System.out.println("Enter 2nd player name");//2 ввод имени второго игрока
			Player player2 = new Player(sc.nextLine());//2 создаем экз класса через конструктор и вводим имя второго игрока

			GuessNumber game = new GuessNumber(player1,player2);//3 создаем конструктор GAME и передаем ему введенные параметры Player1 и Player2

			game.play();// 4 запускаем метод Play который содержит параметры Player1 и Player2
			do {
				System.out.println("Want to continue ? [Y/N]");
				answer = sc.nextLine();
			} while(!answer.equals("Y") && !answer.equals("N"));
		} while(answer.equals("Y"));
		System.out.println("bye");
	}
}