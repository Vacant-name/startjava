package com.startjava.lesson_2_3_4.game;

public class Player {
	private String name;
	private int number;
	int[] arrayNumbers = new int[10];

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

//	public void setArrayNumbers(int[] arrayNumbers) {
//		this.arrayNumbers = arrayNumbers;
//	}
//
//	public int[] getArrayNumbers() {
//		return arrayNumbers;
//	}
}