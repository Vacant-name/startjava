package com.startjava.lesson_1.cycle;

public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println("number " + i);
		}

		int counter = 0;
		int result = 6;
		while(counter >= -6) {
			System.out.println("number " + result);
			result -= 2;
			counter--;
		}

		int sumOdd = 0;
		int num = 10;
		do {
			if(num % 2 != 0) {
			sumOdd += num;
			}
			num++;
		} while(num <= 20);
		System.out.println("sumOdd " + sumOdd);
	}
}