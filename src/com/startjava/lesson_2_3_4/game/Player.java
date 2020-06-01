package com.startjava.lesson_2_3_4.game;

public class Player {
	private String name;
	private int number;
	private int[] enteredNums = new int[10];
	private int attempt;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setEnteredNums(int num) {
		enteredNums[attempt] = num;
	}

	public int[] getEnteredNums() {
		return enteredNums;
	}

	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}

	public int getAttempt() {
		return attempt;
	}
}