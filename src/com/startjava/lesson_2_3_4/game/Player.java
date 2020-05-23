package com.startjava.lesson_2_3_4.game;

public class Player {
	private String name;
	private int number;
	private int[] enteredNums = new int[10];
	private int attempt;
	private int[] checkArr = new int[10];
	private int checkNum;
	private int[] screenArr = new int[10];
	private int  screenNum;

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

	public void setAttempt(int num) {
		this.attempt = num;
	}

	public int getAttempt() {
		return attempt;
	}

	public void setCheckArr(int num) {
		checkArr[checkNum] = num;
	}

	public int[] getCheckArr() {
		return checkArr;
	}

	public void setCheckNum(int num) {
		this.checkNum = num;
	}

	public int getCheckNum() {
		return checkNum;
	}

	public void setScreenArr(int[] num) {
		this.screenArr = num;
	}

	public int[] getScreenArr() {
		return screenArr;
	}

	public void setScreenNum(int screenNum) {
		this.screenNum = screenNum;
	}

	public int getScreenNum() {
		return screenNum;
	}
}