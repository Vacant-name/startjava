package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int numFirst = 6, numSecond = 3;
		char plus  = '+';
		char minus = '-';
		char multiply = '*';
		char division = '/';
		char surplus = '%';
		
		int result =  1;
		char rank = '^';
		
		if(plus == '+') {
			System.out.println(numFirst + numSecond);
		} else if(minus == '-') {
			System.out.println(numFirst - numSecond);
		} else if(multiply == '*') {
			System.out.println(numFirst * numSecond);
		} else if(division == '/') {
			System.out.println(numFirst / numSecond);
		} else if(surplus == '%') {
			System.out.println(numFirst % numSecond);
		} else if(rank == '^') {
			for(int i = 1; i <= numSecond; i++) {
				result = numFirst * result;
			}
			System.out.println(result);
		}
	}
}