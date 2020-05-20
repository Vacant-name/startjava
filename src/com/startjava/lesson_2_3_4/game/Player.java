package com.startjava.lesson_2_3_4.game;

public class Player {
	private String name;
	private int number;
	private int[] arrayNumbers = new int[10];
	private int j;

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

	public void setArrayNumbers(int num) {
		arrayNumbers[j] = num;
	}

	public int[] getArrayNumbers() {
		return arrayNumbers;
	}

	public void setJ(int j) {
		this.j = j;
	}

}