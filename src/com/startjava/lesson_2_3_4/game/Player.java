package com.startjava.lesson_2_3_4.game;

public class Player {
	private String name;
	private int number;
	private int[] enteredNum = new int[10];
	private int attempt;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int num) {
		this.number = num;
	}

	public int getNumber() {
		return number;
	}

	public void setEnteredNum(int num) {
		enteredNum[attempt] = num;
	}

	public int[] getEnteredNum() {
		return enteredNum;
	}

	public void setAttempt(int num) {
		this.attempt = num;
	}

	public int getAttempt() {
		return attempt;
	}
}